package curso_programacao_condicionail;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hora inicial do jogo: ");
		int horaInicial = sc.nextInt();
		System.out.print("Hora final do jogo: ");
		int horaFinal = sc.nextInt();
	    int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}

}
