import java.lang.reflect.Field;

class Employee {
    public String name = "John";
    public int salary = 5000;
}

public class ObjectToJson {
    public static void main(String[] args) throws Exception {
        Employee emp = new Employee();
        StringBuilder json = new StringBuilder("{");
        Field[] fields = emp.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            json.append("\"").append(fields[i].getName()).append("\":\"")
                .append(fields[i].get(emp)).append("\"");
            if (i < fields.length - 1) json.append(", ");
        }
        json.append("}");
        System.out.println(json);
    }
}