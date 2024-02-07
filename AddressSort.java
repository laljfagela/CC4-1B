// Programmed by: FAGELA, LUCCI ANIA LUISSE J.
// Activity: Address Sort Algorithm 
// Date of Submission: February 06,2024 

import java.util.Scanner;

public class AddressSort {
    public static int ctr = 0; 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); ctr++;

        System.out.print("Enter the base address (B): "); ctr++;
        int baseAddress = scanner.nextInt(); ctr++;

        System.out.print("Enter the weight (w): "); ctr++;
        int weight = scanner.nextInt(); ctr++;

        System.out.print("Enter the number of dimensions: "); ctr++;
        int numDimensions = scanner.nextInt(); ctr++;

        int[] upperBounds = new int[numDimensions]; ctr++;
        int[] arrayIndex = new int[numDimensions]; ctr++;

        ctr++;
        for (int i = 0; i < numDimensions; i++) { ctr++;ctr++;
            System.out.print("Enter the upper bound " + (i+1) + ": ");ctr++;
            upperBounds[i] = scanner.nextInt();ctr++;

            System.out.print("Enter the array index " + (i+1) + ": ");ctr++;
            arrayIndex [i] = scanner.nextInt();ctr++;
        }
        int sumOfProducts = 0;ctr++;
        ctr++;
        for (int i = 1; i <= numDimensions; i++){ ctr++;ctr++;
            int arrayIndex2 = arrayIndex[i-1];ctr++;

            ctr++;
            for (int j = i; j < numDimensions; j++){ ctr++;ctr++;
                arrayIndex2 *= upperBounds[j];ctr++;
            }
            sumOfProducts += arrayIndex2; ctr++;
        }
        int total = baseAddress + (weight*sumOfProducts); ctr++;
        System.out.println(total); ctr++;
        System.out.print(ctr);
        scanner.close();
    } 
}
