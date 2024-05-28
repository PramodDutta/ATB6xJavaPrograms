package src.may.ex_16052024.multilevelinheritance;

public class Lab176 {
    public static void main(String[] args) {

//        GrandFather grandFather = new GrandFather();
//        grandFather.home();
//
//        Father father = new Father();
//        father.home();
//
//        Child child = new Child();
//        child.home();


        // Dynamic Dispatch
        //
        GrandFather grandFather1 = new GrandFather();
        GrandFather grandFather2 = new Father();
        GrandFather grandFather3 = new Child();

        Father f1 = new Child();
        f1.extra();

//        Child c1 = new GrandFather();
//        Father c2 = new GrandFather();






    }
}
