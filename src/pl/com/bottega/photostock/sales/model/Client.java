package pl.com.bottega.photostock.sales.model;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class Client {


    protected String name;
    protected String address;
    protected ClientStatus status;
    protected double amount;
    protected boolean isActive = true;


    public Client(String name, String address, ClientStatus status, double amount) {
        this.name = name;
        this.address = address;
        this.status = status;
        this.amount = amount;
    }


    public Client(String name, String address) {
        this(name, address, ClientStatus.STANDARD);
    }

    public Client(String name, String address, ClientStatus status) {
        this.name = name;
        this.address = address;
        this.status = status;
    }

    public boolean canAfford(double price) {
        return amount >= price;
    }

    public void charge(double price, String couse) throws IllegalArgumentException {
        if (canAfford(price)) {
            amount -= price;
        } else
            throw new IllegalArgumentException("You can not afford this!");
    }

    public void recharge(double price) {
        amount += price;
    }

    public double getSaldo() {
        return amount;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return isActive;
    }

    public String introduce() {
        return name + " - " + status.getPolishString(status);
    }
}
