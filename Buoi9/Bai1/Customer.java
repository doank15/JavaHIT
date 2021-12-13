package Bai1;

public class Customer extends Person {
    private int balance;
    public Customer(String name, String address, int balance) {
        super(name,address);
        this.balance = balance;
    }
    public void display() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Balance: " + balance);
    }
}
