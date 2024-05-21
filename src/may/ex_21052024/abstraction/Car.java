package src.may.ex_21052024.abstraction;

abstract class Car {
    Car() {
    }

    void gearbox(){
        System.out.println("GearBox is working");
    }

    abstract void drive();
}
