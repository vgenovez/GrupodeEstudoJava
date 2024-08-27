package prinpOOHerancaPolimorfismo;
public class ImpostoPessoaJuridica implements Imposto {
  private Double rendaAnual;
  
  public ImpostoPessoaJuridica(Double rendaAnual) {
      this.rendaAnual = rendaAnual;
  }
  
  public Double calcularImposto() {
      return this.rendaAnual * 0.1; 
  }
  
  public Double getRendaAnual() {
      return this.rendaAnual;
  }
}