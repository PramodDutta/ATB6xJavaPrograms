package src.june.ex_01062024;
import java.util.HashSet;
import java.util.Set;

public class Lab245 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        // How Hashset Works?
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Water Melon");
        //fruits.add(123);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.remove("Apple"));
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Water Melon");
        System.out.println(fruits);







    }
}
