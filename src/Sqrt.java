package src;
public class Sqrt extends OperationUnaire {
  public Sqrt(double valeur) {
    super(valeur);
  }
  
  @Override
  public double calculer() {
    if (getValeur() < 0) {
      throw new ArithmeticException("Il est impossible de calculer la racine carrée d'un nombre négatif !");
    }
    return Math.sqrt(getValeur());
  }
}