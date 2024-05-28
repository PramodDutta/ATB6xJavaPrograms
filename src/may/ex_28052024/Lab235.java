package src.may.ex_28052024;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SequencedCollection;

public class Lab235 {
    public static void main(String[] args) {
        ArrayList mylist1 = new ArrayList(); // CR - CO
        List mylist = new ArrayList(); //FR -> CO
        SequencedCollection mylist2 = new ArrayList(); // GF -> CO
        Collection mylist3 = new ArrayList(); //GGF -> CO

        // ArrayList - Behind the scen it users, Dynamic Array
        // Size filled around 90, it double the size automatically

        // Size is Dynamic
        // Duplicate is allowed
        // Insertion Order is preserved
        // Heterogeneous Objects are allowed
        // Null insertion is possible

        mylist.add("Pramod");
        mylist.add("Anusha");
        mylist.add("Kiran");
        System.out.println(mylist);

        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add("Pramod");
        mylist.add(null);
        mylist.add(null);
        System.out.println(mylist);

        System.out.println(mylist.size());
        mylist.remove("Pramod");
        System.out.println(mylist);



    }
}
