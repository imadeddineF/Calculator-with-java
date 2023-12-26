package src;
import java.util.Scanner;

public class Calculatrice {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose an operation:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Sin");
    System.out.println("6. Cos");
    System.out.println("7. Log");
    System.out.println("8. Exp");
    System.out.println("9. Sqrt");
    int choice = scanner.nextInt();
    double value1, value2;
    switch (choice) {
      case 1:
      case 2:
      case 3:
      case 4:
        System.out.println("Enter two values:");
        value1 = scanner.nextDouble();
        value2 = scanner.nextDouble();
        break;
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
        System.out.println("Enter a value:");
        value1 = scanner.nextDouble();
        value2 = 0; // For unary operations, set the second value to 0
        break;
      default:
        System.out.println("Invalid choice");
        scanner.close();
        return;
    }
    CalculMath operation = createOperation(choice, value1, value2);
    if (operation != null) {
        System.out.println("Result: " + operation.calculer());
    }
    scanner.close();
  }
  private static CalculMath createOperation(int choice, double value1, double value2) {
    switch (choice) {
      case 1:
        return new Addition(value1, value2);
      case 2:
        return new Soustraction(value1, value2); // Assuming Soustraction is your subtraction class
      case 3:
        return new Multiplication(value1, value2);
      case 4:
        return new Division(value1, value2);
      case 5:
        return new Sin(value1);
      case 6:
        return new Cos(value1);
      case 7:
        return new Log(value1);
      case 8:
        return new Exp(value1);
      case 9:
        return new Sqrt(value1);
      default:
        return null;
    }
  }
}
