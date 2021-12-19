package BaiTap;

// package BaiTap;

import java.util.Scanner;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String address;

    public Person() {}
    public Person(int i, String name, String address) {
        this.id = i;
        this.name = name;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: " );
        name = sc.nextLine();
        System.out.println("Enter Address: ");
        address = sc.nextLine();
    }
    
    @Override
    public String toString() {
        return "Person [address= " + address + ", id= " + id + ", name= " + name + "]";
    }
    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        return getId() - o.getId();
    }
    

}
