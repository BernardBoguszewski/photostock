package pl.com.bottega.photostock.sales.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class Offer {


    private final Client owner;
    private List<Product> items = new ArrayList<>();
    double totalCost;

    public Offer(Client owner, List<Product> items) {
        this.owner = owner;
        this.items = items;
        this.totalCost = calculateTotalCost();
    }

    private double calculateTotalCost(){
        return 0;
    }

    public boolean sameAs(Offer offer, double liczba) {

        return false;//// TODO: 10.03.2016
    }

    public int getItemsCount() {

        return items.size();
    }

    public double getTotalCost() {
        double sum = 0;
        for (Product pic : items) {
            sum += pic.getPrice();
        }
        return sum;
    }

    public List<Product> getItems() {
        return items;
    }
}
