package src;
public class Division extends OperationBinaire {
  public Division(double valeur1, double valeur2) {
  super(valeur1, valeur2);
  }

  @Override
  public double calculer() {
    return valeur1 / valeur2;
  }
}
