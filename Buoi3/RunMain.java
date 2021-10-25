public class RunMain {
    public static void main(String[] args) {
        Car carX = new Car();    
        carX.setSoBanhXe(5);
        carX.setMauSac("Red");
        System.out.println("So banh Xe " + carX.getSoBanhXe());
        System.out.println("Mau Xe " + carX.getMauSac());
    }
}
