package src;
public class Exp extends OperationUnaire {
  public Exp(double valeur) {
  super(valeur);
  }
  
  @Override
  public double calculer() {
    return Math.exp(valeur);
  }
}