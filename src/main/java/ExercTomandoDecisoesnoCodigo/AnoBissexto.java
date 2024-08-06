package ExercTomandoDecisoesnoCodigo;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Ano: ");
		int ano = scanner.nextInt();
		
		if (ano % 4 != 0 || ( ano % 100 == 0 && ano % 400 != 0))
			System.out.println("Nao e bissexto!");
		else
			System.out.println("È bissexto");
		
		scanner.close();
	}

}
