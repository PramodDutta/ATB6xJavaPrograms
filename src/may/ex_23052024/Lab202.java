package src.may.ex_23052024;

public class Lab202 {
    public static void main(String[] args) {
        Person p1 = new Person("Amit");
        Person p2 = new Person("Pramod");

        System.out.println(Person.footBallClub);

        // Static
        //  ClassName. func
        Person.m1();
        p1.m1();
        p2.m1();

        Person.footBallClub = "ManU";
        System.out.println(p1.footBallClub);
        System.out.println(p2.footBallClub);

        p1.name = "Lucky";
        System.out.println(p2.name);

        // Non Static - Ref
        p1.m2();
        p2.m2();
        //Person.m2();




    }
}

class Person{
    static String footBallClub = "Arsenal";


    static {
        System.out.println("Once, When class is loaded");
    }

    {
        System.out.println("IIB");
    }

    // Static F(n)
    static void m1(){

        System.out.println("I am common F(n)");
    }

    // Non Static F(n)
    void m2(){
        System.out.println(" Person -> "+this.name);
        System.out.println(footBallClub);
    }


    String name; // non static

    public Person(String name) {
        this.name = name;
    }


}
