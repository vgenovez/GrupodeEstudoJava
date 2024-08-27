package prinpOOHerancaPolimorfismo;
public class CalculadoraImposto {
  public static void main(String[] args) {
      Imposto[] impostos = {
          new ImpostoPessoaJuridica(100_000.0),
          new ImpostoPessoaFisica(100_000.0)
      };
      
      for(Imposto imposto : impostos) {
          System.out.println(imposto.calcularImposto());
      }
  }
}