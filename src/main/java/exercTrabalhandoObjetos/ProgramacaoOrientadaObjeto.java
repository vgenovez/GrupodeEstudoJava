package exercTrabalhandoObjetos;
import java.util.Scanner;

public class ProgramacaoOrientadaObjeto {
  public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    calculadora.calcular();
  }
}

class Calculadora {
  double operando1;
  double operando2;

  public void calcular() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe os 2 operandos: ");
    this.operando1 = scanner.nextDouble();
    this.operando2 = scanner.nextDouble();
    double resultado = somar();
    System.out.printf("%.2f + %.2f = %.2f", operando1, operando2, resultado );
    scanner.close();
  }

  public double somar() {
    return operando1 + operando2;
  }
}
