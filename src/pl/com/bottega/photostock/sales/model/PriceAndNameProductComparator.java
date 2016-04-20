package pl.com.bottega.photostock.sales.model;

import java.util.Comparator;

/**
 * Created by bernard.boguszewski on 17.04.2016.
 */
public class PriceAndNameProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.calculatePrice() == o2.calculatePrice()){ // TODO: 17.04.2016 jak zmienimy naMoney to equals
            return o1.getNumber().compareTo(o2.getNumber());
        }
        else{
            if(o1.calculatePrice() > o2.calculatePrice())
                return 1;
            return -1;
        }
    }
}
