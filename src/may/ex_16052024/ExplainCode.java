package src.may.ex_16052024;

public class ExplainCode {
    public static void main(String[] args) {
        GrandFather g  = new Son();
        g.home(); // What will be the output
    }
}
class Son extends Father{
    void home(){
        System.out.println("3BHK");
    }
}


class Father extends GrandFather{
    void home(){
        System.out.println("2BHK");
    }
}


class GrandFather{
    void home(){
        System.out.println("1BHK");
    }
}