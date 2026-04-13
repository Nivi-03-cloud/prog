import java.util.Scanner;

public class MethodPracticeAllInOne {

    // ===== Static method to calculate square =====
    public static int calculateSquare(int number) {
        return number * number;
    }

    // ===== Method using Math class =====
    public static double calculateSquareRoot(int number) {
        return Math.sqrt(number);
    }

    // ===== Recursive method to find factorial =====
    public static int findFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * findFactorial(number - 1);
    }

    // ===== Method to find maximum of two numbers =====
    public static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    // ===== Method to print table (method reuse example) =====
    public static void printTable(int number) {
        int limit = 10;

        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===== User Input =====
        int inputNumber1;
        int inputNumber2;

        System.out.print("Enter first number: ");
        inputNumber1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        inputNumber2 = scanner.nextInt();

        // ===== Calling methods multiple times =====

        // Square
        int squareResult = calculateSquare(inputNumber1);
        System.out.println("Square of " + inputNumber1 + " = " + squareResult);

        // Square root
        double sqrtResult = calculateSquareRoot(inputNumber1);
        System.out.println("Square root of " + inputNumber1 + " = " + sqrtResult);

        // Factorial (recursive)
        if (inputNumber1 < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            int factorialResult = findFactorial(inputNumber1);
            System.out.println("Factorial of " + inputNumber1 + " = " + factorialResult);
        }

        // Max using Math class
        int maxResult = findMax(inputNumber1, inputNumber2);
        System.out.println("Maximum = " + maxResult);

        // Method reuse (called twice)
        printTable(inputNumber1);
        printTable(inputNumber2);

        // Close scanner
        scanner.close();
    }
}
