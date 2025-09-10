import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class Worker {
    @LogExecutionTime
    void task1() {
        for (int i = 0; i < 1000000; i++);
    }

    @LogExecutionTime
    void task2() {
        for (int i = 0; i < 10000000; i++);
    }
}

public class Main8 {
    public static void main(String[] args) throws Exception {
        Worker w = new Worker();
        for (Method m : Worker.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                m.invoke(w);
                long end = System.nanoTime();
                System.out.println(m.getName() + " took " + (end - start));
            }
        }
    }
}