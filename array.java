package oophust;

import java.util.Arrays;
import java.util.Scanner;

public class array {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Prompt user to enter array elements
      System.out.print("Enter the number of elements in the array: ");
      int n = input.nextInt();
      double[] arr = new double[n];
      System.out.print("Enter " + n + " elements: ");
      for (int i = 0; i < n; i++) {
         arr[i] = input.nextDouble();
      }

      // Sort array in ascending order
      Arrays.sort(arr);

      // Calculate sum and average value of array elements
      double sum = 0.0;
      for (int i = 0; i < n; i++) {
         sum += arr[i];
      }
      double avg = sum / n;

      // Print sorted array, sum, and average value
      System.out.println("Sorted array: " + Arrays.toString(arr));
      System.out.println("Sum of array elements: " + sum);
      System.out.println("Average value of array elements: " + avg);
   }
}
