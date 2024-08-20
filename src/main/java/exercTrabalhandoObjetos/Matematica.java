package exercTrabalhandoObjetos;
public class Matematica {
  public static final Double LIMITE_OPERACAO = 100.0; // SNAKE_CASE
  public static Double limite;

  static {
    limite = 101.0;
  }
  
  public static Double soma(double n1, double n2) {
    double soma = n1 + n2;
    if (soma > LIMITE_OPERACAO)
      return LIMITE_OPERACAO;
    else return soma;
  }

  public Double somaNaoEstatica(double n1, double n2) {
    double soma = n1 + n2;
    if (soma > LIMITE_OPERACAO)
      return LIMITE_OPERACAO;
    else return soma;
  }
}