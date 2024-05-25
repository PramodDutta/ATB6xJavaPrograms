package src.may.ex_25052024;

public class Lab221 {
    public static void main(String[] args) {
        try{
            String ip = args[0];
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            System.out.println(a);
            System.out.println(b);
        }catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Problem with the Code!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
