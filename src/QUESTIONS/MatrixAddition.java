package QUESTIONS;
import java.util.Scanner;

public class MatrixAddition {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Input first matrix
        System.out.println("Enter elements of the first matrix:");
        int[][] matrix1 = inputMatrix(rows, cols);

        // Input second matrix
        System.out.println("Enter elements of the second matrix:");
        int[][] matrix2 = inputMatrix(rows, cols);

        // Add matrices
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Set diagonal elements to 0
        setDiagonalToZero(resultMatrix);

        // Display the result matrix
        System.out.println("Resultant matrix after addition and setting diagonal elements to 0:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Function to input a matrix from the user
    private static int[][] inputMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to set diagonal elements of a matrix to 0
    private static void setDiagonalToZero(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 0;
        }
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
