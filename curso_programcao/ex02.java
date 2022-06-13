package curso_programcao;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double delta;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		System.out.println("Enter the value of a, b and c:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		delta = Math.pow(b, 2.0) - 4 * a * c;
		System.out.println("The value of delta is: " + delta);
		x1 = (-b + Math.sqrt(delta)) / 2 * a;
		x2 = (-b - Math.sqrt(delta)) / 2 * a;
		System.out.println("The value of x1 and x2 repectively:");
		System.out.println(x1);
		System.out.println(x2);

		sc.close();

	}

}
