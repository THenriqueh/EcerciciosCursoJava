package curso_programacao_estrutRepetitivas;

import java.util.Scanner;

public class exmploFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
	
		int soma = 0;

		for(int i= Math.min(x, y) + 1;i< Math.max(x, y);i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}	
		}
		System.out.println(soma);
		sc.close();
	}

}
