package src;
public class Soustraction extends OperationBinaire {
  public Soustraction(double valeur1, double valeur2) {
  super(valeur1, valeur2);
  }

  @Override
  public double calculer() {
    return valeur1 - valeur2;
  }
}
