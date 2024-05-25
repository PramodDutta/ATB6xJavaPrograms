package src.may.ex_25052024.exceptions;

public class Lab222 {
    public static void main(String[] args) {
        try {
            String s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("something went wrong!");
        }


        System.out.println("End of Program!");

    }
}
