package pl.com.bottega.photostock.sales.model.products;

import pl.com.bottega.photostock.sales.model.AbstractProduct;
import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.Product;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class Picture extends AbstractProduct {

    private String number;

    public Picture(String title, double price, String format, String[] tags, String author, boolean isAvailable, String number) {
        super(title, price, format, tags, author, isAvailable, number);
        this.number = number;
    }

    /*
    public Picture(String number, double price, String[] tags) {
        this(number, price, tags, true);
    }
    */

    public double calculatePrice() {
        return 0;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isAvailableChange() {
        return !isAvailable;
    }

    public boolean equals(Picture pic) {
        if (number == pic.getNumber())
            return true;
        else return false;

    }


    public void reservePer() {

    }

    public void unReservePer() {

    }

    public void soldPer(Client client) {

    }

    public void cancel() {
        isAvailable = false;
    }

    public String getNumber() {
        return number;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Picture picture = (Picture) o;

        return number.equals(picture.number);

    }

    @Override
    public int hashCode() {
        return number.hashCode();
    }

}
