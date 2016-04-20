package pl.com.bottega.photostock.sales.model.products;

import pl.com.bottega.photostock.sales.model.AbstractProduct;
import pl.com.bottega.photostock.sales.model.Product;

/**
 * Created by bernard.boguszewski on 03.04.2016.
 */
public class Clip extends AbstractProduct{


    private double duration;
    private String resolution;


    public Clip(String title, double price, String format, String[] tags, String author, boolean isAvailable, String number, double duration, String resolution) {
        super(title, price, format, tags, author, isAvailable, number);
        this.duration = duration;
        this.resolution = resolution;
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

    @Override
    public String getNumber() {
        return number;
    }
}
