// Programmed by: FAGELA, LUCCI ANIA LUISSE J.
// Activity: Address Sort Algorithm 
// Date of Submission: February 06,2024 

import java.util.Scanner;

public class AddressSort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base address (B): ");
        int baseAddress = scanner.nextInt();

        System.out.print("Enter the weight (w): ");
        int weight = scanner.nextInt();

        System.out.print("Enter the number of dimensions: ");
        int numDimensions = scanner.nextInt();

        int[] upperBounds = new int[numDimensions];
        int[] arrayIndex = new int[numDimensions];

        for (int i = 0; i < numDimensions; i++) {
            System.out.print("Enter the upper bound " + (i+1) + ": ");
            upperBounds[i] = scanner.nextInt();

            System.out.print("Enter the array index " + (i+1) + ": ");
            arrayIndex [i] = scanner.nextInt();
        }
        int sumOfProducts = 0;
        for (int i = 1; i <= numDimensions; i++){
            int arrayIndex2 = arrayIndex[i-1];

            for (int j = i; j < numDimensions; j++){
                arrayIndex2 *= upperBounds[j];
            }
            sumOfProducts += arrayIndex2;
        }
        int total = baseAddress + (weight*sumOfProducts);
        System.out.println(total);
        scanner.close(); 
    } 
}
