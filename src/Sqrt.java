package src;
public class Sqrt extends OperationUnaire {
  public Sqrt(double valeur) {
    super(valeur);
  }
  
  @Override
  public double calculer() {
    if (getValeur() < 0) {
      throw new ArithmeticException("You can't sqrt negative number!");
    }
    return Math.sqrt(getValeur());
  }
}