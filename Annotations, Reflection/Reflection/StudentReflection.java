class Student {
    String name;
    public Student() {
        this.name = "Default Student";
    }
}

public class StudentReflection {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");
        Object student = clazz.getDeclaredConstructor().newInstance();
        System.out.println("Created Object: " + student);
    }
}