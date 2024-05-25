package src.may.ex_25052024.exceptions;

public class Lab223 {
    public static void main(String[] args) {
        final double pi = 3.14;
        try {
            int a = 0;
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Exit");
        } finally {
            System.out.println("I am final");
        }
    }
}
