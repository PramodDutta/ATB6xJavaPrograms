package src.may.ex_18052024.accessModifiers.police;

public class JrCop {
    public static void main(String[] args) {

        Cop cop = new Cop(10);
        System.out.println(cop.gun);
        cop.canIShoot();


    }
}
