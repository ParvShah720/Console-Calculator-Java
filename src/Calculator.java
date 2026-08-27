import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while ( true ) {
            System.out.println("\nCalculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose operation: ");
            int choice;
            try {
                choice = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid whole number.");
                sc.next();
                continue;
            }

            if ( choice == 5) break;

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Result: %.2f%n", add(a, b));
                    break;

                case 2:
                    System.out.printf("Result: %.2f%n", subtract(a, b));
                    break;

                case 3:
                    System.out.printf("Result: %.2f%n", multiply(a, b));
                    break;

                case 4:
                    try {
                        System.out.printf("Result: %.2f%n", division(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    public static double add(int a, int b){
        return a + b;
    }

    public static double subtract(int a, int b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if ( b == 0 ) throw new ArithmeticException("Division by zero is not possible!");

        return (double) a / b;
    }
}