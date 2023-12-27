package src;
public class Log extends OperationUnaire {
  public Log(double valeur) {
    super(valeur);
  }
  
  @Override
  public double calculer() {
    if (getValeur() <= 0) {
      throw new ArithmeticException("Il est impossible de calculer le log d'un nombre négatif ou de 0 !");
    }
    return Math.log(getValeur());
  }
}