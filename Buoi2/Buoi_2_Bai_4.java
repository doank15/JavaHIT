package Buoi2;
import java.util.Scanner;
public class Buoi_2_Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str; 
        str = sc.nextLine();
        str = str.replaceAll("[0-9]", "");
        int l = str.length();
        str = str.trim();
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        arr[0]-=32;
        for(int i = 1 ; i < l ; i++) {
            if(arr[i] == 32) {
                arr[i+1] -=32;
                i++;
            }
            
        }
        for(int i = 0 ; i<l ; i++){
            System.out.print(arr[i]);
        }
        sc.close();
    }
}
