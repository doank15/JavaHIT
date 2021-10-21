package Buoi2;
import java.util.Scanner;
public class Buoi_2_Bai_2 {
  
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] arr = new int[1000];
     public static void main(String[] args) {
        int select;
        select = sc.nextInt();
        switch (select) {
            case 1:
                Input();
                break;
            case 2: 
                Output();
                break;
            case 3:
                InsertElement();
                break;
            case 4:
                DeleteElement();
                break;
            case 5:
                DisplayReverse();
                break;
            case 6:
                DisplayFirstElement();
                break;
            case 7:
                Sum();
                break;
            case 8:
                System.out.println("End");
                break;
            default:
                System.out.println("\nNhap Lai!!!!");
        }    
    }
    public static void Input() {
        n = sc.nextInt();
        for(int i =0;i <n;i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void Output() {
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void InsertElement() {
        int x, k;
        System.out.println("\nx: ");
        x = sc.nextInt();
        System.out.println("\nk: ");
        k = sc.nextInt();
        for(int i = n ; i>=k ;i--) {
            arr[i] = arr[i-1];
        }
        arr[k-1] = x;
        n++;
        Output();
    }
    public static void DeleteElement() {
        int k1;
        System.out.println("\nk: ");
        k1 = sc.nextInt();
        for(int i = k1-1 ; i< n-1 ;i++) {
            arr[i] = arr[i+1];
        }
        n--;
        Output();
    }
    public static void DisplayReverse() {
        for(int i = n-1;i>= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static boolean IsPrime(int number) {
        if(number < 2) return false;
        for(int i = 2; i*i<=number;i++) {
            if(number % i == 0) return false; 
        }
        return true;
    }
    public static void DisplayFirstElement() {
        System.out.println("\narr[1] : " + arr[1]);
        for(int i = 0 ; i<n ; i++ ){
            if(i==1) continue;
            else{
                if(arr[i] % arr[1] ==0){
                    System.out.println(arr[i] + " ");
                }
            }
        }
    }
    public static void Sum() {
        int sum = 0;
        for(int i =0 ; i< n ; i++) {
            if(IsPrime(arr[i])) {
                sum += arr[i];
            }
        }
        System.out.print("\nTong cac so nguyen to: " + sum);
    }



}
