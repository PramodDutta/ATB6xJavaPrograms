package src.may.ex_25052024.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab225 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("C://a.txt");
    }

    static void readFile(String fileName) throws FileNotFoundException {
        int a = 10 / 10;
        int c =0;
       // int a1 = 10 / c;
//        try {
//            FileReader f = new FileReader(new File("C://a/txt"));
//        }
//        catch (Exception e){
//            System.out.println("File not found!");
//        }

        FileReader f = new FileReader(new File("C://a/txt"));

    }
}


