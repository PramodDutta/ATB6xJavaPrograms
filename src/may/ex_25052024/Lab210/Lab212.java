package src.may.ex_25052024.Lab210;

public class Lab212 {
}

class PersonATB{
    Integer rollNo;
    String name;
    Long phoneNumber;

    public PersonATB(String name, Integer rollNo, Long phoneNumber) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
