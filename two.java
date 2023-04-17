package oophust;

import java.util.Scanner;

public class two {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Prompt user to enter matrix dimensions
      System.out.print("Enter number of rows in matrix: ");
      int rows = input.nextInt();
      System.out.print("Enter number of columns in matrix: ");
      int cols = input.nextInt();

      // Create two matrices of the same size
      int[][] matrix1 = new int[rows][cols];
      int[][] matrix2 = new int[rows][cols];

      // Prompt user to enter matrix elements for matrix 1
      System.out.println("Enter matrix elements for matrix 1:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix1[i][j] = input.nextInt();
         }
      }

      // Prompt user to enter matrix elements for matrix 2
      System.out.println("Enter matrix elements for matrix 2:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrix2[i][j] = input.nextInt();
         }
      }

      // Add the two matrices
      int[][] result = new int[rows][cols];
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }

      // Print the resulting matrix
      System.out.println("Resultant matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print(result[i][j] + " ");
         }
         System.out.println();
      }
   }
}