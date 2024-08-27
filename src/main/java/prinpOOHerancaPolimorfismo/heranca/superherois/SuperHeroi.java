package prinpOOHerancaPolimorfismo.heranca.superherois;

public abstract class SuperHeroi {
  public static final boolean tendencia = true;

  protected String traje;
  protected String[] superPoderes;

  public SuperHeroi(String traje, String[] superPoderes) {
    // final int qualquer = 1;
    // qualquer = 2;
    this.traje = traje;
    this.superPoderes = superPoderes;
  }

  public abstract void usarSuperPoder(int index);

  public String getTraje() {
    return traje;
  }
}
