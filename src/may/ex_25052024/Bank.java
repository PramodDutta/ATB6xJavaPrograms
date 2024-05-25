package src.may.ex_25052024;

public class Bank {
    private String currency;
    private Integer amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank bankName) throws Exception {
        if (!bankName.currency.equalsIgnoreCase("INR")) {
            throw new Exception("Currency Doesn't Match");
        }
        Integer sum = this.amount + bankName.amount;
        return sum;
    }

    public Integer add1(Bank bankName1) {
        try {
            if (!bankName1.currency.equalsIgnoreCase("INR")) {
                throw new Exception("Currency Doesn't Match");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Integer sum = this.amount + bankName1.amount;
        return sum;
    }










}
