import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Basic Calculator (+ - * / ^)");

        while (running) {
            System.out.println("\nChoose operation:");
            System.out.println("1. Add (+)");
            System.out.println("2. Subtract (-)");
            System.out.println("3. Multiply (*)");
            System.out.println("4. Divide (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            if (choice == 6) {
                running = false;
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            double result = 0;
            boolean error = false;

            switch (choice) {
                case 1: result = a + b; break;
                case 2: result = a - b; break;
                case 3: result = a * b; break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!");
                        error = true;
                    } else {
                        result = a / b;
                    }
                    break;
                case 5: result = Math.pow(a, b); break;
                default:
                    System.out.println("Unexpected error: Invalid operation!");
                    error = true;
                    break;
            }

            if (!error) {
                char[] operators = {'+', '-', '*', '/', '^'};
                System.out.println(a + " " + operators[choice-1] + " " + b + " = " + result);
            }
        }

        scanner.close();
        System.out.println("Thank you!");
    }
}