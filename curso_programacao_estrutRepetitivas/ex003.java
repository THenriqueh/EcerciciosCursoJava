package curso_programacao_estrutRepetitivas;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int x = sc.nextInt();
		while (x != 4) {
			if (x == 1) {
				cont1 += 1;
			} else if (x == 2) {
				cont2 += 1;
			} else if (x == 3) {
				cont3 += 1;
			}
			x = sc.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Alcool: " + cont1);
		System.out.println("Gasolina: " + cont2);
		System.out.println("Disel: " + cont3);
		sc.close();

	}

}
