package src.may.ex_18052024.encapsulation;

public class Lab191 {
    public static void main(String[] args) {
        vwoLogin v1 = new vwoLogin("admin", "admin123");
        // Hidden
        //System.out.println(v1.password);
        //v1.username  = "pramod";
        System.out.println(v1.username);

    }
}

class vwoLogin {
    public String username;
    private String password;

    public vwoLogin(String username, String password) {
        this.password = password;
        this.username = username;
    }
}