package src.may.ex_04052024;

public class Lab135 {
    public static void main(String[] args) {
        // Arrays
        // Collection of similar Data Type.

        // Find the Max in the Arrays
        int[] salaries = {30, 50, 60, 90, 10, 100, 999, -1, -2};
        // How do we find the Max Sal in the array?
        // Loop -> Logic -> max = 0, for i - 0 to length
        // salaries[i] > max -> max ... 0 to l - max
        int max_salary = Integer.MIN_VALUE; //-2147483648
        // -2147483648 to 2147483647

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max_salary) {
                max_salary = salaries[i];
            }
        }
        int j = 0; // j=9
        while (j < salaries.length) {
            if (salaries[j] > max_salary) {
                max_salary = salaries[j];
            }
            j++;
        }
        System.out.println("Max Sal -> " + max_salary);

    }
}
