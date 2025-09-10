import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class Calculator {
    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    int square(int x) {
        if (cache.containsKey(x)) return cache.get(x);
        int result = x * x;
        cache.put(x, result);
        return result;
    }
}

public class Main12 {
    public static void main(String[] args) throws Exception {
        Calculator c = new Calculator();
        Method m = Calculator.class.getMethod("square", int.class);
        System.out.println(m.invoke(c, 5));
        System.out.println(m.invoke(c, 5));
    }
}