package desafioSemana3GrupoJava;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
	  
	      Scanner scanner = new Scanner(System.in);
	      var valorDigitado = scanner.nextLine();
	      String saida = "pong";
	      
	      if (valorDigitado.equals("ping")) {
	         System.out.println(saida);
	      }
	      else{
	         System.out.println("Não foi digitado ping");
	      }
	    
	      scanner.close();

	}

}
