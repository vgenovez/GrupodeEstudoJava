package prinpOOHerancaPolimorfismo.encapsulamento;
public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.ligarCarro();
    carro.acelerar();
    carro.frear();
    System.out.println(carro.getVolante());
  }
}