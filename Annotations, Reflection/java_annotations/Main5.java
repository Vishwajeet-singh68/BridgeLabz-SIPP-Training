import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Array index issue")
    public void run() {}
}

public class Main5 {
    public static void main(String[] args) throws Exception {
        Method m = Software.class.getMethod("run");
        BugReport[] reports = m.getAnnotationsByType(BugReport.class);
        for (BugReport r : reports) {
            System.out.println(r.description());
        }
    }
}