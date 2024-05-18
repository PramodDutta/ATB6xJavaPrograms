package src.may.ex_18052024.encapsulation;

public class Lab192 {

    public static void main(String[] args) {
        vwoLogin1 v1 = new vwoLogin1("admin","admin123");
        //v1.username = "admin";
        String username = v1.getUsername();
        // Code to Auth  isAuth = true
       // String password = v1.getPassword(false);
        v1.setPassword("pramod",true);

    }



}

class vwoLogin1{
    private String username;
    private String password;

    public vwoLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAuth) {
        if(isAuth) {
            return password;
        }
        else {
            return "Not Allowed";
        }
    }

    public void setPassword(String password, boolean isAuth) {
        if(isAuth) {
            this.password = password;
        }
        else {
            System.out.println("Not Allowed");
        }
    }
}