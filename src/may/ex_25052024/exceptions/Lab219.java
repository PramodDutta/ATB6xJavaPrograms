package src.may.ex_25052024.exceptions;

public class Lab219 {
    public static void main(String[] args) {
        String sh = args[0]; // 5
        int x = Integer.parseInt(sh); // (String)5 -> 5(int) // int x = 5
        int a = 10/x; // 10/5 -> 2 // java.lang.ArithmeticException
        System.out.println(x);
        System.out.println(a);

        // Test case for the program
        // -=> 5 - Happy
        // No Input - java.lang.ArrayIndexOutOfBoundsException
        // 0 - java.lang.ArithmeticException
        // -5
        // pramod - java.lang.NumberFormatException
        // 3.45 - java.lang.NumberFormatException
        // @@#$%^&^%$#% - java.lang.NumberFormatException



        // NumberFormatException
        // ArrayIndexOutOfBoundsException
        // ArithmeticException

    }
}
