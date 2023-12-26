package src;
public class Addition extends OperationBinaire {
  public Addition(double valeur1, double valeur2) {
    super(valeur1, valeur2);
  }

  @Override
  public double calculer() {
    return getValeur1() + getValeur2();
  }
}
