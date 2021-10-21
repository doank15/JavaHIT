package Buoi1.src;
import java.util.Scanner;

public class Bai_1 {
public static void main(String[] args) {
	int m,n;
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap m:");
	m = scanner.nextInt();
	System.out.println("Nhap n:");
	n = scanner.nextInt();
	for(int i = 0 ;i < m ;i++) {
		for(int j = 0;j<n;j++) {
			System.out.print("*"+" ");
		}
		System.out.println("");
	}
}
}
