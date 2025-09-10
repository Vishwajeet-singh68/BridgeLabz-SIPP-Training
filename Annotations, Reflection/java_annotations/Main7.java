import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Add login feature", assignedTo = "Bob")
    void login() {}

    @Todo(task = "Fix logout bug", assignedTo = "Alice", priority = "HIGH")
    void logout() {}
}

public class Main7 {
    public static void main(String[] args) {
        for (Method m : Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task() + " " + t.assignedTo() + " " + t.priority());
            }
        }
    }
}