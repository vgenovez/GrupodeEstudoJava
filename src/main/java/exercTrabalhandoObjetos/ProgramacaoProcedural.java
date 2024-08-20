package exercTrabalhandoObjetos;
import java.util.Scanner;

public class ProgramacaoProcedural {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Informe os 2 operandos: ");
      double operando1 = scanner.nextDouble();
      double operando2 = scanner.nextDouble();

      double resultado = operando1 + operando2;

      System.out.printf("%.2f + %.2f = %.2f", operando1, operando2, resultado );
      scanner.close();
  }
}
