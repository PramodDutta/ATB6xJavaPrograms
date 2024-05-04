package src.april.ex_25042024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the x");
        double x = sc.nextDouble();
        System.out.println("Enter the value for the y");
        double y = sc.nextDouble();
        System.out.println("Enter the value for the z");
        double z = sc.nextDouble();

        double result;
        //  3/ x^2 + y^2 - |z|
        // A + b - C , A ->  x^2 , B -> Y ^2 , C ->  |Z| abs(Z) ->  -1 -> 1, -2 -> 2

        result = Math.cbrt( Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);

        sc.close();





    }
}
