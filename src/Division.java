package src;
public class Division extends OperationBinaire {
  public Division(double valeur1, double valeur2) {
    super(valeur1, valeur2);
  }

  @Override
  public double calculer() {
    if (getValeur2() == 0) {
      throw new ArithmeticException("La division par zéro est impossible !");
    }
    return getValeur1() / getValeur2();
  }
}
