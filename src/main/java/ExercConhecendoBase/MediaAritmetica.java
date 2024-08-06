package ExercConhecendoBase;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite as 3 notas d@ alun@:");
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double nota3 = scanner.nextDouble();
		
		scanner.close();
		
		double mediaAritmetica = nota1 + nota2 + nota3 / 3;
		System.out.printf("A Media obtida foi %.2f", mediaAritmetica);

	}

}
