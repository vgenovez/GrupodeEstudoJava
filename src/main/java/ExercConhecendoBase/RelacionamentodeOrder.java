package ExercConhecendoBase;

import java.util.Scanner;

public class RelacionamentodeOrder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 2 numero:");
		int numero1 = scanner.nextInt();
		int numero2 = scanner.nextInt();
		
		System.out.println(numero1 + " = " + numero2 + "?" + (numero1 == numero2));
		System.out.println(numero1 + " != " + numero2 + "?" + (numero1 != numero2));
		System.out.println(numero1 + " > " + numero2 + "?" + (numero1 > numero2));
		System.out.println(numero1 + " < " + numero2 + "?" + (numero1 < numero2));
		System.out.println(numero1 + " >= " + numero2 + "?" + (numero1 >= numero2));
		System.out.println(numero1 + " <= " + numero2 + "?" + (numero1 <= numero2));
		
		scanner.close();
	}

}
