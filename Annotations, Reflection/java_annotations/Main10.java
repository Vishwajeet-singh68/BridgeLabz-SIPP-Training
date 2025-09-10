import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    void adminTask() {
        System.out.println("Admin task executed");
    }
}

public class Main10 {
    public static void main(String[] args) throws Exception {
        String currentUserRole = "USER";
        SecureService s = new SecureService();
        for (Method m : SecureService.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed r = m.getAnnotation(RoleAllowed.class);
                if (r.value().equals(currentUserRole)) {
                    m.invoke(s);
                } else {
                    System.out.println("Access Denied!");
                }
            }
        }
    }
}