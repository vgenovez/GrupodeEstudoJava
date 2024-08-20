package exercTrabalhandoObjetos;
public class Carro {
  public String modelo;
  public int ano;
  public String cor;
  public int velocidade;
  
  public Carro(String modelo, int ano, String cor) {
      this.modelo = modelo;
      this.ano = ano;
      this.cor = cor;
  }
  
  public void acelerar() {
      velocidade += 10;
  }
  
  public String getDetalhes() {
      return "Modelo: " + modelo + " Ano: " + ano + " Cor: " + cor + " Velocidade: " + velocidade; 
      
  }
}