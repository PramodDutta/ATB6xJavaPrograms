package src.april.ex_25042024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {
        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        // A -> "A" -> index - A
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a':
                System.out.println("Vowel");
                int a = 10;
                int b = 10;
                System.out.println(a+b);
                // executing the code
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It it Consonant");
        }

        sc.close();


    }
}
