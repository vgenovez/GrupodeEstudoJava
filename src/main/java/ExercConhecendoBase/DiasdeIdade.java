package ExercConhecendoBase;

import java.util.Scanner;

public class DiasdeIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a sua idade");
		int anosDeIdade = scanner.nextInt();
		int diasDeIdade = anosDeIdade * 365;
		System.out.printf("Voce tem %d dias de idade!", diasDeIdade);
		scanner.close();
	}
}