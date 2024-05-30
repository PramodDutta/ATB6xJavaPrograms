package src.may.ex_30052024;

import java.util.ArrayList;
import java.util.List;

public class Lab238 {
    // List - ArrayList, LinkedList, Vector,Stack
    // Set - HashSet, LinkedHashSet, TreeSet
    // Map - HashMap, LinkedHashMap, TreeMap
    // Queue - PriorityQueue, LinkedList
    // Hashtable, Properties

    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);
        System.out.println(courseList);
    }







}
