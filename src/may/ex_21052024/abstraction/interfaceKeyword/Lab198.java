package src.may.ex_21052024.abstraction.interfaceKeyword;

public class Lab198 {
    public static void main(String[] args) {

        // Engine e1 = new Engine();
        Car c1 = new Car();
        c1.startEngine();
        c1.applyBreak();

        // Default
        c1.haltingEngineJustStart();
        c1.haltingEngineJustStop();

       // Engine.M1();

        c1.stopEngine();

    }
}
