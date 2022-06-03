package curso_programacao_condicionail;

import java.util.Scanner;

public class ex005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		double preco;
		System.out.print("Digite o numero do seu lanche: ");
		int pedido = sc.nextInt();
		System.out.print("Agora diga quantas unidades você deseja: ");
		int quantidade = sc.nextInt();
		if (pedido == 1) {
			preco = cachorroQuente * pedido;
			System.out.printf("A sua compra custou: R$%.2f", preco);
		} else if (pedido == 2) {
			preco = xSalada * quantidade;
			System.out.printf("A sua compra custou: R$%.2f", preco);
		} else if (pedido == 3) {
			preco = xBacon * quantidade;
			System.out.printf("A sua compra custou: R$%.2f", preco);
		} else if (pedido == 4) {
			preco = torradaSimples * quantidade;
			System.out.printf("A sua compra custou: R$%.2f", preco);
		}
		  else if (pedido == 5) {
			preco = refrigerante * quantidade;
			System.out.printf("A sua compra custou: R$%.2f", preco);
		} else {
			System.out.println("O numero do lanche não existe");
		}
		sc.close();
	}

}
