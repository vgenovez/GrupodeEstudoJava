package prinpOOHerancaPolimorfismo.heranca.superherois;

import java.util.Arrays;

public class HomemDeFerro extends SuperHeroi implements Avenger {

  public HomemDeFerro(String traje, String[] superPoderes) {
    super(traje, superPoderes);
    System.out.println("Home de Ferro!");
  }
  
  public void usarSuperPoder(int index) {
    System.out.println(Arrays.toString(superPoderes));
    System.out.println("Falar com Jarvis");
    //super.usarSuperPoder(index);
  }

  public boolean isLeader() {
    return true;
  }
}
