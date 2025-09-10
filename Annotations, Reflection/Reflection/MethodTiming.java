import java.lang.reflect.Method;

class Task {
    public void runTask() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Task completed");
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method method = Task.class.getMethod("runTask");

        long start = System.nanoTime();
        method.invoke(task);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) / 1_000_000 + " ms");
    }
}