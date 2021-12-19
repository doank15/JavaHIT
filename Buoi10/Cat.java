public class Cat extends Animal {
    @Override
       public void getClazz() {
           System.out.println("Hello Kitty");
       }
       public void sleep(int start, int end, String name) {
           System.out.println(name + " was sleeped: " + (end - start) + " hours");
       }
}
