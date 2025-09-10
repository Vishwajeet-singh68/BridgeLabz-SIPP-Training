import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User2 {
    @JsonField(name = "user_name")
    String username;

    @JsonField(name = "user_age")
    int age;

    User2(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

public class Main11 {
    public static void main(String[] args) throws Exception {
        User2 u = new User2("Alice", 25);
        StringBuilder json = new StringBuilder("{");
        Field[] fields = User2.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            if (f.isAnnotationPresent(JsonField.class)) {
                JsonField jf = f.getAnnotation(JsonField.class);
                json.append(""").append(jf.name()).append("":"").append(f.get(u)).append(""");
                if (i < fields.length - 1) json.append(",");
            }
        }
        json.append("}");
        System.out.println(json);
    }
}