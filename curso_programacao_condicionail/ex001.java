package curso_programacao_condicionail;
/*
 Make a program to read an integer number, and then tell if this number is negative or positive.
 */
import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for you know if he is positive or negative: ");
		int number = sc.nextInt();
		if (number > 0) {
			System.out.println("The number that you entered is positive!");
		}
		else {
			System.out.println("The number that you entered is negative!");
		}
		sc.close();
	}

}
