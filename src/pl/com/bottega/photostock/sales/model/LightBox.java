package pl.com.bottega.photostock.sales.model;


import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class LightBox {

    private String name;
    private Client owner;
    //private Picture[] items = new Picture[1];
    private List<Picture> items = new ArrayList<>(); //automatycznie wnioskowany typ
    private boolean closed = false;


    public LightBox(Client owner) {
        this.owner = owner;
    }

    public LightBox(String name, Client owner) {
        this.name = name;
        this.owner = owner;
    }



    public LightBox() {
    }

    /*
            public void add2(Picture pictureToAdd) throws IllegalStateException, IllegalArgumentException {
                for (Picture pic : items) {
                    if (pic != null) {
                        String nr1 = pic.getNumber();
                        String nr2 = pictureToAdd.getNumber();
                        if (nr1.equals(nr2))
                            throw new IllegalArgumentException("Lightbox already contains picture " + pictureToAdd.getNumber());
                    }

                }
                int coursor = 0;
                boolean added = false;
                for (Picture reference : items) {
                   // Picture reference = items[coursor];
                    if (reference == null) {
                        //items[coursor] = pictureToAdd;//aby kmp
                        added = true;
                        break;//break !!!
                    }
                    coursor++;
                }
                if(!added)
                    throw new IllegalStateException("Lightbox przepełniony!");
            }
        */
    public void add(Picture pictureToAdd) throws IllegalStateException, IllegalArgumentException {
        validate();
        if (items.contains(pictureToAdd))
            throw new IllegalArgumentException("Already contains");
        if(!pictureToAdd.isAvailable())
            throw new ProductNotAvailableException("trying to reserve", pictureToAdd.getNumber(), LightBox.class);
        items.add(pictureToAdd);
    }

    public void close() {
        this.closed = true;
    }

    public void changeName(String newName) {
        validate();
        this.name = newName;
    }

    public void remove(Picture pictureToRemove) throws IllegalStateException, IllegalArgumentException {
        validate();
        boolean removed = items.remove(pictureToRemove);
        if (!removed)
            throw new IllegalStateException("Does not contain");
        items.remove(pictureToRemove);
    }

    public String getName() {
        return name;
    }


    public int getItemsCount() {
        return items.size();
    }

    public List<Picture> getPictures() {
        return items;
    }

    public String getOwnerName() {
        return owner.getName();
    }


    private void validate() {
        if (closed)
            throw new IllegalStateException("Closed!");
        if (!owner.isActive()) //// TODO: 20.03.2016
            throw new IllegalStateException("Owner is not active!");
    }

    public static LightBox newLbxAdd(List<LightBox> lightBoxes) {
        Client boss = new Client("Boss", "Sun", ClientStatus.VIP, 0);
        LightBox newLbx = new LightBox(boss);
        for (LightBox lbx : lightBoxes) {
            for (Picture pic : lbx.getPictures()) {
                newLbx.add(pic);
            }
        }
        return newLbx;
    }

    public static void show(LightBox lbx) {
        for (Picture pic : lbx.getPictures()) {
            if (pic.isAvailable())
                System.out.println("  " + pic.getNumber() + " | " + pic.getPrice());
            else
                System.out.println("X " + pic.getNumber() + " | " + pic.getPrice());
        }
    }


}



