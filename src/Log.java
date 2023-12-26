package src;
public class Log extends OperationUnaire {
  public Log(double valeur) {
    super(valeur);
  }
  
  @Override
  public double calculer() {
    return Math.log(valeur);
  }
}