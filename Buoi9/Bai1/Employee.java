package Bai1;

public class Employee extends Person {
    private int salary;
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + salary);
    }

}
