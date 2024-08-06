package ExercTomandoDecisoesnoCodigo;

import java.util.Scanner;

public class CategoriaAtleta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a idade do atleta:");
		int idade = scanner.nextInt();
		
		if (idade >= 10 && idade <= 12)
			System.out.println("Mirim");
		else if (idade >= 13 && idade <= 15)
			System.out.println("Infantil");
		else if (idade >= 16 && idade <= 18)
			System.out.println("Juvenil");
		else 
			System.out.println("Idade Invalida");
		
		scanner.close();
	}
}