package ExercConhecendoBase;

import java.util.Scanner;

public class estoqueMedio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a quantidade minima e maxima do produto: ");
		int quantidadeMinima = scanner.nextInt();
		int quantidadeMaxima = scanner.nextInt();
		
		double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;
		
		System.out.printf("O estoque medio é de %.2f unidades.", estoqueMedio);
		
		scanner.close();
		
	}

}
