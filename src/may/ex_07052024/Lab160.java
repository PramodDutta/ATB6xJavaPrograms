package src.may.ex_07052024;

import java.util.Arrays;
import java.util.Scanner;

public class Lab160 {
    //    Practice -
    //    Prime Number
    //    Swap Two Numbers
    //    String reverse
    //    Take User input as array
    //    Maximum in Array
    //    Print diagonal Elements 2D array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prime Number
        System.out.println("Prime Numbers:");
        printPrimes(20);

        // Swap Two Numbers
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swapNumbers(a, b);

        // String Reverse
        String str = "Hello, world!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));

        // Take User input as array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array entered by user: " + Arrays.toString(array));

        // Maximum in Array
        System.out.println("Maximum in the array: " + findMax(array));

        // Print diagonal Elements 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Diagonal elements of the 2D array:");
        printDiagonal(matrix);
    }

    // Function to print prime numbers up to a given limit
    public static void printPrimes(int limit) {
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to swap two numbers
    public static void swapNumbers(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Function to find the maximum element in an array
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Function to print diagonal elements of a 2D array
    public static void printDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
    }

}
