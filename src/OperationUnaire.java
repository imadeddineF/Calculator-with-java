package src;
public abstract class OperationUnaire implements CalculMath {
  private double valeur;
  
  public double getValeur() {
    return valeur;
  }
  public void setValeur(double valeur) {
    this.valeur = valeur;
  }

  public OperationUnaire(double valeur) {
    setValeur(valeur);
  }
}