import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(5)
    String username;

    User(String username) throws Exception {
        this.username = username;
        for (Field f : this.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(MaxLength.class)) {
                int max = f.getAnnotation(MaxLength.class).value();
                String val = (String) f.get(this);
                if (val.length() > max) {
                    throw new IllegalArgumentException("Too long");
                }
            }
        }
    }
}

public class Main9 {
    public static void main(String[] args) throws Exception {
        new User("John");
        new User("Jonathan");
    }
}