public class Animal {
    private String name;
    private int age;

    public Animal() {}

    //----------------ghi đè
    public void getClazz() {
        System.out.println("Get Class");
    }

    //----------------Nạp chồng
    public void sleep(String name) {
        System.out.println(name + "is sleeping");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    
}
