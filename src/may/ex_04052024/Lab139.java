package src.may.ex_04052024;

public class Lab139 {
    public static void main(String[] args) {
        int[][] array_2d = {
                {34, 1},
                {34, 2},
                {34, 3}
        };

        int row = array_2d.length;
        for (int i = 0; i < row; i++) { // Row  0,1
            for (int j = 0; j < array_2d[i].length; j++) { // Column , 0,1,2
                System.out.println(array_2d[i][j]);
            }
        }




    }
}
