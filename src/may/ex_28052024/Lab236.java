package src.may.ex_28052024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab236 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList(); // CR - CO
        mylist1.add("Pramod");
        mylist1.add("Anusha");
        mylist1.add("Kiran");
        System.out.println(mylist1);

        Vector v = new Vector();
        v.add("Pramod"); // t1
        v.add("Anusha"); // t1
        v.add("Kiran"); // t1
        v.remove("Kiran"); // t1

        // can you guess the o/p?

        System.out.println(v);



    }
}
