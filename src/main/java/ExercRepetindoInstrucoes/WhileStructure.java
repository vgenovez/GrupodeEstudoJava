package ExercRepetindoInstrucoes;

import java.util.Scanner;

public class WhileStructure {
   public static void main(String[] args) {
      int numero = 7;
      int tentativas = 5;

      Scanner scanner;
      for(scanner = new Scanner(System.in); tentativas > 0; --tentativas) {
         System.out.println("Digite um número entre 1 e 10:");
         int numeroFornecido = scanner.nextInt();
         if (numeroFornecido == numero) {
            System.out.println("Você acertou! :D");
            scanner.close();
            return;
         }
      }

      System.out.println("Você errou! :(");
      scanner.close();
   }
}
