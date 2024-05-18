package src.may.ex_18052024.superthiskeyword;

public class Lab183 {
    public static void main(String[] args) {
        Student1 sc1 = new Student1();
        //Person1 pc1 = new Person1();
        // If child has DC -> PC DC will be called by
        // super() automatically in Java


        // super.variable
        // super.method()
        // super() -> DC
        // super("pramod') -> PC


    }
}

class Person1{
    Person1(){
        System.out.println("Person1 - DC");
    }


    Person1(String a){
        System.out.println("Person1 - PC");
    }
    Person1(String a,int a1){
        System.out.println("Person1 - PC");
    }
}

class Student1 extends Person1{
    Student1(String s){
        System.out.println("PC -Student");
    }


    Student1(){
        //super("pramod");
//        this("pramod");
//        super("pramod");
        System.out.println("Student1 - DC");
    }
}