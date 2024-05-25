package src.may.ex_25052024.Lab210;

public class Lab215 {
    public static void main(String[] args) {
        Day d = Day.FRIDAY;
        System.out.println(d);


        for (Size size : Size.values()) {
            System.out.println("Size: " + size + ", Abbreviation: " + size.getSize());
        }

    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String size;

    Size(String s) {
        this.size = s;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}