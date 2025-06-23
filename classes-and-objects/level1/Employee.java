public class Employee{
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name: "+name+"\nid:"+id+"\nsalary:"+salary);
    }
}