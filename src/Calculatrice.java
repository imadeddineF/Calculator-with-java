package src;
import java.util.Scanner;

public class Calculatrice {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("\n╔═══════════════════════════╗");
  System.out.println("║      Les opérations       ║");
  System.out.println("╠═══════════════════════════╣");
  System.out.println("║ 1. Addition               ║");
  System.out.println("║ 2. Soustraction           ║");
  System.out.println("║ 3. Multiplication         ║");
  System.out.println("║ 4. Division               ║");
  System.out.println("║ 5. Sinus                  ║");
  System.out.println("║ 6. Cosinus                ║");
  System.out.println("║ 7. Logarithme             ║");
  System.out.println("║ 8. Exponentielle          ║");
  System.out.println("║ 9. Racine carrée          ║");
  System.out.println("╚═══════════════════════════╝\n");

  System.out.print("Choisissez une opération (1-9) : ");
  int choix = scanner.nextInt();
  double valeur1, valeur2;
      
  switch (choix) {
    case 1:
    case 2:
    case 3:
    case 4:
      System.out.print("\nEntrez la première valeur : ");
      valeur1 = scanner.nextDouble();
      System.out.print("Entrez la deuxième valeur : ");
      valeur2 = scanner.nextDouble();
      break;
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
      System.out.print("\nEntrez une valeur : ");
      valeur1 = scanner.nextDouble();
      valeur2 = 0;
      break;
    default:
      System.out.println("\n\033[1;31mChoix invalide !");
      scanner.close();
    return;
  }

  CalculMath operation = createOperation(choix, valeur1, valeur2);
  if (operation != null) {
    try {
      double resultat = operation.calculer();
      System.out.println("\n\033[1;32m╔═══════════════════════════════════╗");
      System.out.println("║ Résultat : " + resultat);
      System.out.println("╚═══════════════════════════════════╝");
    } catch (ArithmeticException e) {
      System.out.println("\n\033[1;31m╔═════════════════════════════════════════════╗");
      System.out.println("║ Erreur : " + e.getMessage());
      System.out.println("╚═════════════════════════════════════════════╝");
    }
  }

  scanner.close();
}

  private static CalculMath createOperation(int choix, double valeur1, double valeur2) {
    switch (choix) {
      case 1:
        return new Addition(valeur1, valeur2);
      case 2:
        return new Soustraction(valeur1, valeur2);
      case 3:
        return new Multiplication(valeur1, valeur2);
      case 4:
        return new Division(valeur1, valeur2);
      case 5:
        return new Sin(valeur1);
      case 6:
        return new Cos(valeur1);
      case 7:
        return new Log(valeur1);
      case 8:
        return new Exp(valeur1);
      case 9:
        return new Sqrt(valeur1);
      default:
        return null;
    }
  }
}
