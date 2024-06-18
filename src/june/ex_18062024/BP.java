package src.june.ex_18062024;

public class BP {

    String name;
    String name2;

    BP step1(String name) {
        System.out.println("1");
        this.name = name;
        return this;
    }

    BP step2(String name2) {
        System.out.println("2");
        this.name2 = name2;
        return this;
    }

    BP step3() {
        System.out.println("Completed");
        return this;
    }

    public static void main(String[] args) {
        BP bp = new BP();
        bp.step1("Chandu").step2("Ashok").step3();
        // bp.step2().step3().step1();
    }
}
