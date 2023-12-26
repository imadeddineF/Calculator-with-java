package src;
public class Sin extends OperationUnaire {
  public Sin(double valeur) {
    super(valeur);
  }
  
  @Override
  public double calculer() {
    return Math.sin(getValeur());
  }
}