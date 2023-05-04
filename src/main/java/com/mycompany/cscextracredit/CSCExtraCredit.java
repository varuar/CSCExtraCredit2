package com.mycompany.cscextracredit;

public class CSCExtraCredit {

    public static void main(String[] args) {
        int[] a = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3};
        double result = ratio(a);
        System.out.println("Ratio: " + result);
    }

    public static double ratio(int[] a) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the smallest, second smallest, largest, and second largest elements
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            if (current < smallest) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current < secondSmallest) {
                secondSmallest = current;
            }
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest) {
                secondLargest = current;
            }
        }

        // Calculate the ratio and return it
        return ((double)largest + (double)secondLargest) / ((double)smallest + (double)secondSmallest);
    }
}
