package src.may.ex_07052024;

public class Lab153 {
    public static void main(String[] args) {
        // Non Return with no parameter
        saySomethingPlease();
        // Non return with parameter
        sayHelloToYou("pramod");

        // Return with no parameter
        sumOfTwoBad(3, 4);
        // Return with parameter
        int result = sumOfTwoGood(3, 4);
        System.out.println(result);
    }

    static int sumOfTwoGood(int a, int b) {
        return a + b;
    }

    static void sumOfTwoBad(int a, int b) {
        System.out.println(a + b);
    }

    static void sayHelloToYou(String name) {
        System.out.println("Hello, " + name);
    }

    static void saySomethingPlease() {
        System.out.println("Non Return with no parameter");
    }
}
