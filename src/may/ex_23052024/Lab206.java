package src.may.ex_23052024;

public class Lab206 {

    public static void main(String[] args) {
        Car c = new Car("Lambo");

        Car.Engine engine = c.new Engine("400CC");

        engine.start();
        c.drive();

        // Nested Class - To shield the Inner Class.


    }


}

class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }

    // Method
    void drive() {
        System.out.println("You can driver Car");
    }

    class Engine {
        // Instance Variables
        String hoursePower;

        public Engine(String hoursePower) {
            this.hoursePower = hoursePower;
        }

        // Method
        void start() {
            System.out.println("Enginer is started!! -> " + make);
        }

        class GearBox {
            void m2() {
                System.out.println("m2");
            }

            class PP {
                class OO {

                }
            }
        }


    }


}