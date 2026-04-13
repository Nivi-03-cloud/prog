import java.util.Scanner;

public class ArrayPracticeAllInOne {
    public static void main(String[] args) {

        // Scanner for input
        Scanner scanner = new Scanner(System.in);

        // ===== 1D ARRAY PART =====
        int size;

        System.out.print("Enter size of 1D array: ");
        size = scanner.nextInt();

        // Validate input
        if (size <= 0) {
            System.err.println("Invalid array size!");
            System.exit(0);
        }

        int[] numbers = new int[size];

        // Input elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display original array
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Modify array (multiply by 2)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Display modified array
        System.out.println("\nModified Array (Elements * 2):");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Find max and min
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("\nMaximum: " + max);
        System.out.println("Minimum: " + min);


        // ===== 2D ARRAY (MATRIX) PART =====
        int rows, columns;

        System.out.print("\nEnter number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        columns = scanner.nextInt();

        // Validate matrix size
        if (rows <= 0 || columns <= 0) {
            System.err.println("Invalid matrix size!");
            System.exit(0);
        }

        int[][] matrix = new int[rows][columns];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display matrix
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close scanner
        scanner.close();
    }
}
