package curso_programacao_condicionail;
/*
 Read 2 integer values ​​(A and B). Afterwards, the program should show a message "This numbers are Multiples" or "No
Multiples", indicating whether the values ​​read are multiples of each other. Attention: the numbers can be typed in
ascending or descending order.
 */
import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value for A: ");
		int numberA = sc.nextInt();
		System.out.print("Enter a value for B: ");
		int numberB = sc.nextInt();
		if (numberA % numberB == 0 || numberB % numberA == 0) {
			System.out.println("This numbers are Multiples!");
		}
		else {
			System.out.println("No Multiples!");
		}
		sc.close();
	}

}
