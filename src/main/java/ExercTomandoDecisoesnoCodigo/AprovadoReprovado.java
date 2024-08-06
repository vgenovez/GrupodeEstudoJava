package ExercTomandoDecisoesnoCodigo;

import java.util.Scanner;

public class AprovadoReprovado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe 3 notas:");
		double nota1 = scanner.nextDouble();
		double nota2 = scanner.nextDouble();
		double nota3 = scanner.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;
		
		if (media >= 7.0)
			System.out.println("Aprovado!");
		else
			System.out.println("Reprovado!");
		
		scanner.close();
	}
}