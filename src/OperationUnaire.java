package src;
public abstract class OperationUnaire implements CalculMath {
  protected double valeur;

  public OperationUnaire(double valeur) {
    this.valeur = valeur;
  }
}