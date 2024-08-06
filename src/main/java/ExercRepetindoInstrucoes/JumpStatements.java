package ExercRepetindoInstrucoes;

import java.util.Scanner;

public class JumpStatements {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      int numero;
      do {
         System.out.println("Digite um número: ");
         numero = scanner.nextInt();
      } while(numero != 1);

      System.out.println("Ufa, acabou o loop!");
      scanner.close();
   }
}
