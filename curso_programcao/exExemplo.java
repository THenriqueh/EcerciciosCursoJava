import java.util.Scanner;

public class exExemplo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Digite a largura do Terreno: ");
		double largura = sc.nextDouble();
		System.out.print("Digite o compriemnto do Terreno: ");
		double comprimento = sc.nextDouble();
		System.out.print("Agora digite o preço por metro quadrado do Terreno: ");
		double preco = sc.nextDouble();
		double area = largura * comprimento;
		double precoTotal = area * preco;

		System.out.printf("AREA =%.2f%n", area);
		System.out.printf("PREÇO = %.2f", precoTotal);
		sc.close();
	}
}

