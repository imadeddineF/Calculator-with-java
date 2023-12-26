package src;
public class Cos extends OperationUnaire {
  public Cos(double valeur) {
  super(valeur);
  }
  
  @Override
  public double calculer() {
    return Math.cos(valeur);
  }
}
