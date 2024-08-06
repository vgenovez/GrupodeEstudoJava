package desafioSemana3GrupoJava;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
	  	Scanner scanner = new Scanner(System.in);
    	var valorDigitado = scanner.nextInt();
    	var valorConvertido = (double) valorDigitado;
    	
    	//var valorConvertido = scanner.nextDouble();
    	System.out.println(valorConvertido);
    	
    	scanner.close();

	}

}
