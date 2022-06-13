package curso_programacao_estrutRepetitivas;

import java.util.Scanner;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/
public class ex03 {
	public static void main(String[] args) {
		System.out.print("Digite a quantidade de testes: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println("DIgite os 3 valores do teste " + i);
			double x1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double media = ((x1*2) + (x2*3) + (x3*5))/(2 + 3 + 5);
			System.out.printf("A média do teste" + i +  " é: %.1f%n", media);
		}
		sc.close();
	}

}
