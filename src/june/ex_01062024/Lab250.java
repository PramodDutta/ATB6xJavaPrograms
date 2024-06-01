package src.june.ex_01062024;

import java.util.HashSet;
import java.util.Set;

public class Lab250 {
    public static void main(String[] args) {
        // Given an array of integers, return an array of the unique elements.
        // Input: [1, 2, 2, 3, 4, 4, 5]
        // Output: [1, 2, 3, 4, 5]
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        Set<Integer> uniqueSet = new HashSet();
        for( int num:  input){
            uniqueSet.add(num);
        }
        System.out.println(uniqueSet);
        // how to print only duplicate element


        //


    }
}
