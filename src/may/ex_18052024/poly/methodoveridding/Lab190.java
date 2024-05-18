package src.may.ex_18052024.poly.methodoveridding;

public class Lab190 {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.bark();
//
//        Hound h = new Hound();
//        h.bark();

        Dog d1  = new Hound(); // Dynamic Dispatch, -> Runtime Polymorphism
        d1.bark();

    }

    void main(String a){}
    void main(int  a){}
    void main(byte  a){}

}
