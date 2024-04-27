package src.ex_27042024;

import java.util.Scanner;

public class Lab097 {
    public static void main(String[] args) {
        //  Leap Year Program - 2024
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 2024, 2000, 1600

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year! ");
        } else {
            System.out.println("Not a Leap Year!");
        }


    }
}
