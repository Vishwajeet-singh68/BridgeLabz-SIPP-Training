import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class CalculatorReflection {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Method m = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        m.setAccessible(true);
        Object result = m.invoke(calc, 5, 7);
        System.out.println("Result: " + result);
    }
}