package pl.com.bottega.photostock.sales.model;

/**
 * Created by bernard.boguszewski on 04.04.2016.
 */
public abstract class AbstractProduct implements Product{
    protected String title;
    protected double price;
    protected String format;
    protected String[] tags;
    protected String author;
    protected boolean isAvailable;
    protected String number;

    public AbstractProduct(String title, double price, String format, String[] tags, String author, boolean isAvailable, String number) {
        this.title = title;
        this.price = price;
        this.format = format;
        this.tags = tags;
        this.author = author;
        this.isAvailable = isAvailable;
        this.number = number;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public void cancel() {
        isAvailable = false;
    }

    @Override
    public void reservePer() {

    }

    @Override
    public void unReservePer() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
