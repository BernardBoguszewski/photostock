package pl.com.bottega.photostock.sales.model;

import java.util.*;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class Reservation extends Object{

    private Client owner;
    private List<Product> items = new LinkedList<>();

    public Reservation(Client owner) {
        this.owner = owner;
    }

    public void add(Product product) throws ProductNotAvailableException, IllegalArgumentException{
        //items.add(Product);// TODO: 03.04.2016
        if(!product.isAvailable())
            throw new ProductNotAvailableException("trying to reserve", product.getNumber(), Reservation.class);
        if(items.contains(product))
            throw new IllegalArgumentException("product is dublicated");
        items.add(product);
    }

    public void removePicture(Product product){
        boolean removed = items.remove(product);
        if(!removed)
            throw new IllegalArgumentException("product never added");
    }

    public Offer generateOffer(){
        List<Product> result = new ArrayList<>();

        for (Product product : items){
            if (product.isAvailable()){
                result.add(product);
            }
        }
        Comparator<Product> comparator = new PriceAndNameProductComparator();
        Collections.sort(result, comparator);

        return new Offer(owner, result);
    }

    public int getItemsCount(){
        return items.size();
    }
}
