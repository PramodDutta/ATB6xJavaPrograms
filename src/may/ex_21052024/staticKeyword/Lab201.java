package src.may.ex_21052024.staticKeyword;

public class Lab201 {
    // Static
    // Data member
    // Function
    // Class

    // Static loads when Class is loaded. -
    public static void main(String[] args) {
//        ATB amit = new ATB("+919876543210");
//        ATB pramod = new ATB("+123456789");
//
//        amit.printDetails();
//        pramod.printDetails();
//
//        System.out.println(ATB.courseName);

        ATB ashok = new ATB("+298743829");
        ATB ashok2 = new ATB("+298743829");

    }


}

class ATB {

    static {
        System.out.println("SIB - Load one Time, Class IS LOADED");
    }

    {
        System.out.println("IIB - instance initialization block. Loaded when Object is created");
    }


    static String courseName = "ATB"; // Static Variable
    String phoneNo; // Non static , Instance Variable

    public ATB(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void printDetails(){
        System.out.println("Your Details -> " +  this.phoneNo);
    }
}
