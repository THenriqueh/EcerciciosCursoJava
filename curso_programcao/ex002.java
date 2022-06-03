/*Write a program to read the value of the radius of a circle, 
  and then display the value of the area of ​​this circle with four
  decimal places as examples.
  Area formula: area = π . radius²
  Consider the value of π = 3.14159
*/
import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		System.out.printf("Enter the radius value: ");
		double r = sc.nextDouble();
		
		double a = pi * r * r;
		
		System.out.printf("O valor do a Area é: %.4f", a);
		
		sc.close();
	}

}
