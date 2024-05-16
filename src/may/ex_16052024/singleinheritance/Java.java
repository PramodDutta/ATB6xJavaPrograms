package src.may.ex_16052024.singleinheritance;

public class Java extends Programming {
    // Single Inherintance -. is A
    // Java is a programming Lang.
    // Python is a programming Lang.

    String newFeature;
//    int version;
//    String author;

    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }

    void printInfo() {
        System.out.println("Feature is -> " + this.newFeature);
        bhk3();

    }


}
