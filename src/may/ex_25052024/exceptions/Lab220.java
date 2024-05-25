package src.may.ex_25052024.exceptions;

import java.io.FileInputStream;

public class Lab220 {
    public static void main(String[] args) {
        // Exception

        // Checked - JVM knows -
        // Compile Time -/JVM? If Knows about it, - Checked Exception
        // FileInputStream f = new FileInputStream("C:/log.txt");
        // File io - open
        try {
            FileInputStream f = new FileInputStream("C:/log.txt");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



        // UnChecked - JVM knows
        int a = 10;
        int c = a/0;
        System.out.println(c);

        String s1 = null;
        s1.trim();

    }



}
