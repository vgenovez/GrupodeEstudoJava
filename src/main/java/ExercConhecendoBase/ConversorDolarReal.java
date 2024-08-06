package ExercConhecendoBase;

import java.util.Scanner;

public class ConversorDolarReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor em dolar: ");
		double valorEmDolar = scanner.nextDouble();
		
		System.out.println("Digite a cotacao do dolar: ");
		double cotacaoDolar = scanner.nextDouble();
		
		double valorEmReal = valorEmDolar * cotacaoDolar;
		
		System.out.printf("O valor em reais é R$ %.2f", valorEmReal);
		
		scanner.close();
	}

}
