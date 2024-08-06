package ExercRepetindoInstrucoes;
//Exercicio Imprimindo o maior número

import java.util.Scanner;

public class Exercise4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int maiorNumero = 0;

      while(true) {
         int numero = scanner.nextInt();
         if (numero < 0) {
            System.out.println(maiorNumero);
            scanner.close();
            return;
         }

         if (numero > maiorNumero) {
            maiorNumero = numero;
         }
      }
   }
}
