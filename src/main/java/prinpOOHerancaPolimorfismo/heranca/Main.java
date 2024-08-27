package prinpOOHerancaPolimorfismo.heranca;

import prinpOOHerancaPolimorfismo.heranca.superherois.Avenger;
import prinpOOHerancaPolimorfismo.heranca.superherois.HomemAranha;
import prinpOOHerancaPolimorfismo.heranca.superherois.HomemDeFerro;
import prinpOOHerancaPolimorfismo.heranca.superherois.SuperHeroi;
import prinpOOHerancaPolimorfismo.heranca.superherois.ViuvaNegra;

public class Main {
  public static void main(String[] args) {
    SuperHeroi[] superHerois = {
      new HomemAranha("Roupa Vermelha com teias", new String[] {"Lançar Teia"}),
      new HomemDeFerro("Roupa Vermelha super resistente", new String[] {"Usar Traje de Guerra"}),
      new ViuvaNegra("Roupa Vermelha / Preta", new String[] {"Espiã"}),
      //new SuperHeroi("meu traje", new String[] {"Contar piada"})
    };

    System.out.println(SuperHeroi.tendencia);

    Avenger avenger = new HomemAranha("Roupa Vermelha com teias", new String[] {"Lançar Teia"});
    avenger.enterBuilding();

    validar(superHerois);

    for (SuperHeroi superHeroi : superHerois) {
      System.out.println(superHeroi.getTraje());
      superHeroi.usarSuperPoder(0);
    }
  }

  static void validar(SuperHeroi[] superHerois) {
    if (superHerois[0] instanceof Object) {
      System.out.println("Lógica de validação do Homem Aranha...");
    }
  }

}
