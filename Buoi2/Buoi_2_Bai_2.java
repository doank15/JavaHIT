package Buoi2;
import java.util.Arrays;
import java.util.Scanner;
public class Buoi_2_Bai_2 {
  static Scanner sc = new Scanner(System.in);
  static int[] arr;
  static int n = 0;
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int select;
        do {
            System.out.println("\n----------------------Menu----------------------");
            System.out.println("1. Tạo và nhập mảng với n só nguyên.");
            System.out.println("2. Hiển thị mảng vừa tạo.");
            System.out.println("3. Thêm một phần tử vào vị trí k bất kỳ.");
            System.out.println("4. Xóa một phần tử tại vị trí k bất kỳ.");
            System.out.println("5. Đảo ngược mảng.");
            System.out.println("6. Hiển thị phần tử a[1] và các số chia hết cho a[1].");
            System.out.println("7. Xuất ra màn hình tổng các số nguyên tố có trong mảng.");
            System.out.println("8. Thoát.");
            System.out.println("------------------------------------------------");

            System.out.print("Mời bạn lựa chọn: ");
            select = sc.nextInt();

            switch(select) {
                case 1: 
                    Input();
                    break;
                case 2:
                    Output();
                    break;
                case 3:
                    Insert();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    DisplayReverse();
                    break;
                case 6: 
                    DisplayValue();
                    break;
                case 7: 
                    Sum();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Moi nhap lai!!!");
                
            }
        }while (select != 8);
    }
    
    //input
    public static void Input() {
        System.out.println("\nNhap n: ");
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0;i < arr.length ;i++) {
            System.out.print("arr[" + i + "] : " );
            arr[i] = sc.nextInt();
        }
    }
    // output
    public static void Output() {
       if(arr.length>0){ System.out.println("\nArray: ");
        for(int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }}
        else{
            System.out.println("\nMang Rong!!!");
        }
    }

    //insert
    public static void Insert() {
        if(arr.length>0){System.out.println("\nNhap vi tri can chen: ");
        int pos = sc.nextInt();
        System.out.println("\nNhap gia tri can chen: ");
        int k = sc.nextInt();

        if(pos < 1 || pos > n) {System.out.println("\nKhong the chen!!!");}
        else { 
            arr = Arrays.copyOf(arr, n+1);
            for(int i = n ;i>=pos;i--) {
                arr[i] = arr[i-1];
            }
            arr[pos-1] = k;
            n++;
        }}
        else{System.out.println("Mang Rong!!!");}
    }
    
    // Delete
    public static void Delete() {
        if(arr.length > 0 ){System.out.println("\nNhap vi tri muon xoa: ");
        int pos = sc.nextInt();
        for(int i = pos-1; i < n-1 ;i++) {
            arr[i] = arr[i+1];
        }
        n--;}
        else {
            System.out.println("Mang rong!!!");
        }
    }
    
    //in dao nguoc 
    public static void DisplayReverse() {
        System.out.println("Mang Dao Nguoc: ");
        for(int i = n-1;i>=0;i--) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // Hien thi phan tu a[1] va cac phan tu chia het a[1]
    public static void DisplayValue() {
        if(arr.length > 0 ){System.out.println("Value array[1]: " + arr[1]);
        for(int i =0 ;i < arr.length;i++) {
            if(i == 1 ) continue;
            else {
                if(arr[i] % arr[1] == 0) {
                    System.out.println(arr[i]);
                }
            }
        }}
        else {
            System.out.println("Mang Rong!!!");
        }
        System.out.println();
    }

    // sum so nguyen to
    public static boolean isPrime(int number) {
        if(number <2) return false;
        for(int i = 2; i*i <= number;i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
    public static void Sum() {
        int sum = 0;
        for(int i = 0 ;i < arr.length; i++) {
            if(isPrime(arr[i])) {
                sum+=arr[i];
            }
        }
        System.out.println("Tong cac so nguyen to co trong mang : " + sum);
    }
}
