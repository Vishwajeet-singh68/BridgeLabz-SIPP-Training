import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PersonReflection {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(p, 40);
        System.out.println("Updated Age: " + ageField.get(p));
    }
}