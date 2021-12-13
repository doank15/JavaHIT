import java.util.Scanner;
import java.util.PrimitiveIterator.OfInt;

public class Run{
    public static void main(String[] args) {
        // DVD[] dvdCollection = new DVD[15];
        Scanner sc = new Scanner(System.in);
        // // dvdCollection[0] = new DVD();
        // DVD x = new DVD("Mai The Doan", 2021, "Nguyen Van A");
        // dvdCollection[0] = x;
        // System.out.println(dvdCollection[0].toString());
        int[] values = new int[20];
        for(int i = 0 ; i< 5 ;i++) {
            values[i] = sc.nextInt();
        }
        for(int value : values) {
            System.out.println(value);
        }
        System.out.println(values.length);
        sc.close();
        
    }
}
