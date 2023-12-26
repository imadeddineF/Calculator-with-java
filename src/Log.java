package src;
public class Log extends OperationUnaire {
  public Log(double valeur) {
    super(valeur);
  }
  
  @Override
  public double calculer() {
    if (getValeur() <= 0) {
      throw new ArithmeticException("You can't log negative number or 0!");
    }
    return Math.log(getValeur());
  }
}