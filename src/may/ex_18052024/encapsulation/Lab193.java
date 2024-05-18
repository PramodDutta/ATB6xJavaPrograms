package src.may.ex_18052024.encapsulation;

public class Lab193 {
    public static void main(String[] args) {
        ICICIBank i = new ICICIBank("pramod", 100);
        System.out.println(i.getBal());
        i.setBal(-100);
        //i.name = "Admin";
        //i.setName("Admin");
        System.out.println(i.getBal());

    }
}
