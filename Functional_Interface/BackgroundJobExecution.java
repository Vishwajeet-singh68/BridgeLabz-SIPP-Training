
public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Background job running...");
        Thread t = new Thread(job);
        t.start();
    }
}
