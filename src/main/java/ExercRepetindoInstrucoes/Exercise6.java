package ExercRepetindoInstrucoes;
//Exercicio Sequência de Fibonacci
import java.util.Scanner;

public class Exercise6 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numero = scanner.nextInt();
      if (numero <= 0) {
         System.out.println(0);
      } else if (numero == 1) {
         System.out.println(1);
      }

      long termoAnterior = 0L;
      long termoAtual = 1L;
      long termoFibonacci = 0L;

      for(int i = 2; i <= numero; ++i) {
         termoFibonacci = termoAnterior + termoAtual;
         termoAnterior = termoAtual;
         termoAtual = termoFibonacci;
      }

      System.out.println(termoFibonacci);
      scanner.close();
   }
}
