package br.com.giulinabezerra.moradias;

public class Casa {
  public Boolean inteligente = false;
  public String nome; 

  public Casa() {  
  }

  public Casa(boolean inteligente) {
    this.inteligente = inteligente;
  }

  public void acenderLuz() {
    if (inteligente)
      System.out.println("Comando de Voz");
    else
      System.out.println("Pressionar interruptor");
  }
}
