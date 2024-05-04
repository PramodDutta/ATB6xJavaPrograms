package src.may.ex_04052024;

import java.util.Scanner;

public class Lab144 {
    public static void main(String[] args) {

        // Palindrome - String
        // naman -> reverse  -> naman
        // 1331 -> 1331
        // Malaylam - Palindrome
        // Madam  true, mom

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check if it is Palindrome or not");
        String user_input = sc.next();

        StringBuilder sb = new StringBuilder(user_input);
        String rev_user_input = sb.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_user_input)){
            System.out.println("Palindrome -> "+ user_input);
        }else{
            System.out.println("Nope!!");
        }


        //revser_String with using rever fucntion



    }
}
