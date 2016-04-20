package pl.com.bottega.photostock.sales.model;

/**
 * Created by bernard.boguszewski on 03.04.2016.
 */
public interface Product {
    boolean isAvailable();
    double calculatePrice();
    void cancel();
    void reservePer();
    void unReservePer();
    double getPrice();

    String getNumber();
}
