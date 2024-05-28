package src.may.ex_25052024;

public class ReadFromExcel {
    // Read from the excel file testdata.xlsx
    // and return the data in the form of a 2D array
    // where each row is a test case and each column is a parameter.
    public static String[][] readData() {
        return new String[][] {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };
    }
    public static void main(String[] args) {
        String[][] data = readData();
        for (String[] row : data) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    // now write a code to read from the excel file testdata.xlsx
    // and return the data in the form of a 2D array
    // where each row is a test case and each column is a parameter.




}
