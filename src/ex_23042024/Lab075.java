package src.ex_23042024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        // Max number in two
        System.out.println("Enter num 1");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        int max = Math.max(num1, num2);
        System.out.println("Max by Math.max func() " + max);

        if (num1 > num2) {
            // C1 -> num 1>  num 2
            // c2 -> num2 > num 1
            // C3 -> num1 == num2
            System.out.println("Max is -> " + num1);
        } else {
            System.out.println("Max is -> " + num2);
        }

        sc.close();


    }
}
