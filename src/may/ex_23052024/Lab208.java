package src.may.ex_23052024;

public class Lab208 {
    public static void main(String[] args) {
        ABC abc = new ABC(){
            @Override
            void m1() {
                System.out.println("M1");
            }
        };
        abc.m1();

        I1 i = new I1() {
            @Override
            public void m2() {
                System.out.println("M2");
            }
        };
        i.m2();



    }
}

//class Anoy extends ABC{
//
//    @Override
//    void m1() {
//
//    }
//}

abstract class ABC{
    abstract void m1();
}

interface I1{
    void m2();
}