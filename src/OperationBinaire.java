package src;
public abstract class OperationBinaire implements CalculMath {
  private double valeur1;
  private double valeur2;

  public double getValeur1() {
    return valeur1;
  }
  public double getValeur2() {
    return valeur2;
  }
  public void setValeur1(double valeur1) {
    this.valeur1 = valeur1;
  }
  public void setValeur2(double valeur2) {
    this.valeur2 = valeur2;
  }

  public OperationBinaire(double valeur1, double valeur2) {
    setValeur1(valeur1);
    setValeur2(valeur2);
  }
}
