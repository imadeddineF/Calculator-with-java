package src;
public class Sqrt extends OperationUnaire {
  public Sqrt(double valeur) {
  super(valeur);
  }
  
  @Override
  public double calculer() {
    return Math.sqrt(valeur);
  }
}