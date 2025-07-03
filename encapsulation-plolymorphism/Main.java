

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee(1, "Alice", 50000);
        employees[1] = new PartTimeEmployee(2, "Bob", 200, 20);
        ((Department)employees[0]).assignDepartment("HR");
        ((Department)employees[1]).assignDepartment("IT");
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println(((Department)emp).getDepartmentDetails());
            System.out.println();
        }
    }
}