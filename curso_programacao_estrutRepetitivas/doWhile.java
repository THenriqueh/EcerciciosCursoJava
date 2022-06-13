package curso_programacao_estrutRepetitivas;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char resp;
		do{
			System.out.println("Quer continuar respondendo?");
			resp = sc.next().charAt(0);
		}while(resp != 'n');
			
		sc.close();
	}
}
