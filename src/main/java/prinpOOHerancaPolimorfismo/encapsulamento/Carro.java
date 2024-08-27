package prinpOOHerancaPolimorfismo.encapsulamento;
/*
 * Cuidado! Não use os atributos nem métodos x e y.
 */
// getters e setters

class Carro {
  private String volante;
  private String pedais;

  private Motor motor;
  private String airbag;

  public Carro() {
    this.motor = new Motor();
    this.volante = "Volante";
    this.pedais = "Pedais";
  }

  public void ligarCarro() {
    System.out.println("Ligando o carro...");
  }

  public void acelerar() {
    motor.iniciar();
    System.out.println("Acelerar...");
  }

  public void frear() {
    System.out.println("Frear...");
  }

  private void detectarColisao() {
    ativarAirbags();
  }

  private void ativarAirbags() {
    System.out.println("Ativando airbags...");
  }

  public String getVolante() {
    return volante;
  }

  public void setVolante(String volante) {
    this.volante = volante;
  }

  public String getPedais() {
    return pedais;
  }

  public void setPedais(String pedais) {
    this.pedais = pedais;
  }

  public Motor getMotor() {
    return motor;
  }

  public void setMotor(Motor motor) {
    this.motor = motor;
  }

  public String getAirbag() {
    return airbag;
  }

  public void setAirbag(String airbag) {
    this.airbag = airbag;
  }
  
}