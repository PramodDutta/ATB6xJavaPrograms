package src.june.ex_18062024;

public class NoDesignPatten {

    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        NoDesignPatten noDesignPatten = new NoDesignPatten();
        noDesignPatten.step1();
        noDesignPatten.step2();
        noDesignPatten.step3();
    }
}
