package Bai1;

public class RunMain {
    public static void main(String[] args) {
        Person person1 = new Employee("Doan", "Nam Dinh", 10000);
        Person person2 = new Customer("Mai The", "Ha Noi", 20000);
        person1.display();
        person2.display();
    }
}
