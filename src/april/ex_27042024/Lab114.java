package src.april.ex_27042024;

public class Lab114 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i%2 ==0 ){
                System.out.println("Even -> " + i);
                continue;
            }
            System.out.println("Odd -> " + i);
        }


    }
}
