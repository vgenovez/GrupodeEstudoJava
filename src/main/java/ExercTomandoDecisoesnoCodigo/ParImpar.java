package ExercTomandoDecisoesnoCodigo;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("É par!");
		else
			System.out.println("É impar!");
		
		scanner.close();
	}
}
