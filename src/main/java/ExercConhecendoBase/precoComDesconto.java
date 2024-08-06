package ExercConhecendoBase;

import java.util.Scanner;

public class precoComDesconto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o preco: ");
		double preco = scanner.nextDouble();
		System.out.println("Digite o desconto em %: ");
		double desconto = scanner.nextDouble();
		
		double valorEconomizado = (preco * desconto) / 100;
		double novoPreco = preco - valorEconomizado;
		
		System.out.printf("O preco com desconto é R$ %.2f e o valor economizado foi R$ %.2f",novoPreco,valorEconomizado);
		
		scanner.close();
	}

}
