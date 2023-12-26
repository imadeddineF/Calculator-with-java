package src;
public class Multiplication extends OperationBinaire {
  public Multiplication(double valeur1, double valeur2) {
  super(valeur1, valeur2);
  }

  @Override
  public double calculer() {
    return valeur1 * valeur2;
  }
}
