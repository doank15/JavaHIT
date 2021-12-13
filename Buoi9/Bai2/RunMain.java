package Bai2;

public class RunMain {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3];
        shapes[0] = new Rectangle(2.2, 3.3);
        shapes[1] = new Circle(2.5);
        shapes[2] = new Rectangle(4.4, 5.5);
        for(int i = 0; i< 3 ;i++) {
            System.out.println("Area of shapes[" + i + "] = " + shapes[i].getArea());
            System.out.println("Perimeter of shapes[" + i + "] = " + shapes[i].getPerimeter());
        }
    }
}
