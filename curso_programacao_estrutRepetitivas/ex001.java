package curso_programacao_estrutRepetitivas;

import java.util.Scanner;

public class ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua senha: ");
		int senha = sc.nextInt();
		while (senha != 2022) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Aprovado");
		sc.close();
	}

}