package Buoi2;

import java.util.Scanner;

/**
 * Buoi2_Bai_1
 */
public class Buoi2_Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a: ");
        int a =  sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.print("c: ");
        int c = sc.nextInt();
        int max = a;
        if(b>max && b> c) max = b;
        else if(c>b) max = c;
        
        System.out.println(max);
        sc.close();
    }
}