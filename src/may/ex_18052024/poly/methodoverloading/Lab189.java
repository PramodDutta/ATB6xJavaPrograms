package src.may.ex_18052024.poly.methodoverloading;

public class Lab189 {

    Lab189(){

    }
    Lab189(int a){

    }
    Lab189(int a, int b){

    }
    Lab189(int a, String b){

    }


    // Method OverLoading -> multiple methods with same name, but different argument.
    // order also matters

    void Gift(String a){
        System.out.println("A is a String" +  a);
    }

    int Gift(int x){
        System.out.println("X is a Int" +  x);
        return x;
    }

    int Gift(float x){
        System.out.println("X is a Int" +  x);
        return 89;
    }

    void Gift(double x){
        System.out.println("X is a double" +  x);
    }

    void a(int pramod,float amit){

    }
    void a(float y,int x){

    }

    public static void main(String[] args) {
        Lab189 p = new Lab189();
        p.Gift(10);
        p.Gift("Pramod");
    }
}
