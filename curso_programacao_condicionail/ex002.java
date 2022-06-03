package curso_programacao_condicionail;
/*
 Write a program to read an integer and tell if this number is even or odd.
 */
import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to know if he is even or odd: ");
		int number = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("The number that you entered is even!");
		}
		else {
			System.out.println("The number that you entered is odd!");
		}
		sc.close();
	}

}
