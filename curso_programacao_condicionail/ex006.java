package curso_programacao_condicionail;

import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EM VINDO AO PORTAL DO IMPOSTO DE RENDA");
		System.out.println("Digite o seu salário: ");
		double salario = sc.nextDouble();
		if (salario > 0 & salario <= 2000) {
			System.out.println("Insento");
		}
			else if (salario > 2000.00 & salario <= 3000.00) {
			double imposto = salario * 0.08;
			System.out.printf("Voce irá pagar: %.2f", imposto);	
		}
			else if (salario > 3000.00 & salario <= 4500.00) {
				double imposto = salario * 0.18;
				System.out.printf("Voce irá pagar: %.2f", imposto);
		}	
			else {
				double imposto = salario * 0.28;
				System.out.printf("Voce irá pagar: %.2f", imposto);
		}
		sc.close();
	}

}
