package lab4.After.bank_application.src.main.bank;

public class Customer {

    private String name;
    private boolean vip;

    public Customer(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }

}
