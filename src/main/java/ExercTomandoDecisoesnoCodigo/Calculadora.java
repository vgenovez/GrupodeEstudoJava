package ExercTomandoDecisoesnoCodigo;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 2 numeros");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		System.out.println("Digite a operação (+,-,*,/):");
		String operador = scanner.next();
		
		switch(operador) {
		case "+" -> System.out.printf("%d %s %d = %d", 
			numero1, operador, numero2, numero1 + numero2);
		case "-" -> System.out.printf("%d %s %d = %d", 
				numero1, operador, numero2, numero1 - numero2);
		case "*" -> System.out.printf("%d %s %d = %d", 
				numero1, operador, numero2, numero1 * numero2);
		case "/" -> System.out.printf("%d %s %d = %d", 
				numero1, operador, numero2, numero1 / numero2);
		default -> System.out.println("Operador invalido");
		}
		
		scanner.close();
		
	}

}
