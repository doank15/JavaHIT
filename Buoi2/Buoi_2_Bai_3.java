package Buoi2;
import java.util.Scanner;
public class Buoi_2_Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        int l = str.length();
        int count = 0,sum=0;
        for(int i = 0 ; i < l ;i++) {
            if(str.charAt(i) >='0' && str.charAt(i)<='9') {
                count++;
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }      
        if(count!=1) {
            System.out.println("True");
            System.out.println("Sum: " + sum);
        }
        else System.out.println("False");
        sc.close();
    }
}
