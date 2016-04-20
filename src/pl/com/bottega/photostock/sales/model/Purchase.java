package pl.com.bottega.photostock.sales.model;

import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.Date;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class Purchase {

    private Date createDate;
    private Client owner;
    private Picture[] items = new Picture[10];

    public Purchase(Client owner, Picture[] items) {
        this.owner = owner;
        this.items = items;
        this.createDate = new Date();
    }
}
