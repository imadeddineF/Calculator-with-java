package src;
import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n╔═══════════════════════════╗");
        System.out.println("║      Les operations       ║");
        System.out.println("╠═══════════════════════════╣");
        System.out.println("║ 1. Addition               ║");
        System.out.println("║ 2. Soustraction           ║");
        System.out.println("║ 3. Multiplication         ║");
        System.out.println("║ 4. Division               ║");
        System.out.println("║ 5. Sin                    ║");
        System.out.println("║ 6. Cos                    ║");
        System.out.println("║ 7. Log                    ║");
        System.out.println("║ 8. Exponentielle          ║");
        System.out.println("║ 9. Racine carree          ║");
        System.out.println("╚═══════════════════════════╝\n");

        System.out.print("Choose an operation (1-9): ");
        int choice = scanner.nextInt();
        double value1, value2;
        
        switch (choice) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("\nEnter the first value: ");
                value1 = scanner.nextDouble();
                System.out.print("Enter the second value: ");
                value2 = scanner.nextDouble();
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.print("\nEnter a value: ");
                value1 = scanner.nextDouble();
                value2 = 0;
                break;
            default:
                System.out.println("\n\033[1;31mInvalid choice!");
                scanner.close();
                return;
        }

        CalculMath operation = createOperation(choice, value1, value2);
        if (operation != null) {
          try {
              double result = operation.calculer();
              System.out.println("\n\033[1;32m╔═══════════════════════════════════╗");
              System.out.println("║ Result: " + result);
              System.out.println("╚═══════════════════════════════════╝");
          } catch (ArithmeticException e) {
            System.out.println("\n\033[1;31m╔═════════════════════════════════════════════╗");
            System.out.println("║ Error: " + e.getMessage());
            System.out.println("╚═════════════════════════════════════════════╝");
          }
        }


        scanner.close();
    }

    private static CalculMath createOperation(int choice, double value1, double value2) {
        switch (choice) {
            case 1:
                return new Addition(value1, value2);
            case 2:
                return new Soustraction(value1, value2);
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
