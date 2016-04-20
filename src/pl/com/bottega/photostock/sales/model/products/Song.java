package pl.com.bottega.photostock.sales.model.products;

import pl.com.bottega.photostock.sales.model.AbstractProduct;
import pl.com.bottega.photostock.sales.model.Product;

/**
 * Created by bernard.boguszewski on 04.04.2016.
 */
public class Song extends AbstractProduct {


    private double duration;
    private String bitRate;



    public enum Channels{
        STEREO("2.0"), FIVE_POINT_ONE("5.1"), SEVEN_POINT_ONE("7.1");

        private String channel;
        Channels(String channel){
            this.channel = channel;
        }

        public String getChannel(){
            return channel;
        }
    }

    public Song(String title, double price, String format, String[] tags, String author, boolean isAvailable, String number, double duration, String bitRate) {
        super(title, price, format, tags, author, isAvailable, number);
        this.duration = duration;
        this.bitRate = bitRate;
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
