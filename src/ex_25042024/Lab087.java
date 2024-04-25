package src.ex_25042024;

public class Lab087 {
    public static void main(String[] args) {
        int itemCode = 001;
        // JDK > 13

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

        char ch = 'z';
        switch (ch) {
            case 'a', 'e', 'i', 'u', 'o' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
             // - >
        }


    }
}
