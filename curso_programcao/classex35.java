package curso_programcao;

import java.util.Scanner;

public class classex35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("What time it?");
		int time = sc.nextInt();
		if (time < 12) {
			System.out.println("Good Morning");
		} else if (time > 12 && time < 18) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evenning");
		}
		sc.close();
	}

}
