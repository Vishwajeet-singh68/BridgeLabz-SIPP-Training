import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String methodName = sc.nextLine();
        int a = sc.nextInt(), b = sc.nextInt();

        MathOperations ops = new MathOperations();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(ops, a, b);
        System.out.println("Result: " + result);
    }
}