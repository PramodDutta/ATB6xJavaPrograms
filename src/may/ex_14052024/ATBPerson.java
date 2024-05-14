package src.may.ex_14052024;

public class ATBPerson {
    // Variables

    String name; // Instance Variables
    long phone;

    public ATBPerson(String name, long phone, String email, boolean isMarried, String courseName) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.isMarried = isMarried;
        this.courseName = courseName;
    }

    public ATBPerson(String name){
        this.name = name;
    }

    public ATBPerson(String name, long phone){
        this.name = name;
        this.phone = phone;
    }

    String email;
    boolean isMarried;
    String courseName;

    // Constructor
    // default - Constructor

    ATBPerson(){
        System.out.println("default - Constructor");
        // DC
        // Special Method with no return type
        // 1 called, when you create new Object
        // It has same name as the className
        courseName = "ATB";
    }





    void ATBPerson(){
        System.out.println("default - Constructor");
    }


    void printDetails(){
//        int age = 10;
//        System.out.println(age);
        System.out.println("Printing details of the student");
    }


}
