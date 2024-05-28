package src.may.ex_28052024;

import java.util.List;

public class Lab231 {
    public static void main(String[] args) {
        // Shopping List
        // Milk, Bread, Butter, Cheese.
        // 4 elements
        // Collection Framework -> How you can store the elements
        // 1. List (Interface) ->ArrayList, LinkedList, Vector, Stack

        List shppoing_list = List.of("Milk", "Bread", "Butter", "Cheese");
        System.out.println(shppoing_list);
        // length
        System.out.println(shppoing_list.size());

        List fruites = List.of("orange", "apple", "banana", "apple", "watermelon");
        // List can duplicate
        System.out.println(fruites);
        System.out.println(fruites.size());

//        List my_10th_marks = List.of(91, 92, 93, 95, 100);
//        System.out.println(my_10th_marks);
//        System.out.println(my_10th_marks.size());
//
//        List different_data_types = List.of("Pramod",true,123);

        System.out.println(fruites.get(0));
        System.out.println(fruites.indexOf("apple"));
        // IsEmpty
        System.out.println(fruites.isEmpty());

        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll


        fruites.add("grapes");
        System.out.println(fruites);








    }
}
