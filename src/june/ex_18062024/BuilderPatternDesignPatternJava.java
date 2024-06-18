package src.june.ex_18062024;

public class BuilderPatternDesignPatternJava {

    public BuilderPatternDesignPatternJava groundFloor(){
        System.out.println("Do some Task of Ground Floor");
        return this;
    }

    public BuilderPatternDesignPatternJava firstFloor(String name){
        System.out.println("Do some Task of first Floor" + name);
        return this;
    }

    public BuilderPatternDesignPatternJava secondFloor(String name, String color){
        System.out.println("Do some Task of first Floor"+ name + color);
        return this;
    }


    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        bp.groundFloor().firstFloor("FF").secondFloor("SF","RED");

        // Rest Assured
        //  get().header().auth().make().response().verify()


    }






}
