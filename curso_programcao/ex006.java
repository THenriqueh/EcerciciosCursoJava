package curso_programcao;

/*
 Write a program that reads three double-precision floating-point values: A, B, and C. Then calculate and
most:
a) The area of ​​the triangle can have A for its base and C for its height.
b) an area of ​​the circle of radius C. (pi = 3.14159)
c) the area of ​​the trapezoid that has A and B for bases and C for height.
d) the area of ​​the square that has side B.
e) the area of rectangle that it has sides A and B.
 */
import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangle, circle, trapezoid, square, rectangle;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangle = A * C / 2.0;
		circle = 3.14159 * C * C;
		trapezoid = (A + B) / 2.0 * C;
		square = B * B;
		rectangle = A * B;

		System.out.printf("TRIANGULO: %.3f%n", triangle);
		System.out.printf("CIRCULO: %.3f%n", circle);
		System.out.printf("TRAPEZIO: %.3f%n", trapezoid);
		System.out.printf("QUADRADO: %.3f%n", square);
		System.out.printf("RETANGULO: %.3f%n", rectangle);

		sc.close();
	}

}
