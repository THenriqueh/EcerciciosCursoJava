package curso_programacao_estrutRepetitivas;

import java.util.Scanner;

public class tabuadaFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual tabuada você quer ver o resultado?");
		int N = sc.nextInt();
		for(int i=1; i<=10; i++) {
			int result = i * N;
			System.out.println(i + " x " + N +" = " + result);	
		}
		sc.close();
	}

}
