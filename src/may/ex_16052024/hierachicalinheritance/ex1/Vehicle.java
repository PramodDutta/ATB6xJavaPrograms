package src.may.ex_16052024.hierachicalinheritance.ex1;

public class Vehicle {
    Vehicle(){
        System.out.println("DC Vehicle");
    }

    void vehicleHasTopSpeed(){
        System.out.println("Yeah from "+getClass().getSimpleName());
    }
}
