/*
Write a program to read four integer values ​​A, B, C and D. Then calculate and show the difference of the product
of A and B by the product of C and D according to the formula: DIFFERENCE = (A * B - C * D).
*/
import java.util.Scanner;
public class ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Declare a value for A: ");
		int a = sc.nextInt();
		System.out.println("Declare a value for B: ");
		int b = sc.nextInt();
		System.out.println("Declare a value for c: ");
		int c = sc.nextInt();
		System.out.println("Declare a value for D: ");
		int d = sc.nextInt();
		int difference = (a * b - c * d);
		System.out.println("DIFFERENCE = " + difference);
		sc.close();
	}

}
