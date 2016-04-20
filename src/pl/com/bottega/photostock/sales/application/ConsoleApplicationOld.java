package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.model.*;
import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.List;

/**
 * Created by bernard.boguszewski on 12.03.2016.
 */
public class ConsoleApplicationOld {
/*
    public static void main(String[] args){

        Client client = new Client("Kowalski", "ul. X", ClientStatus.STANDARD, 0);
        LightBox lbx = new LightBox(client);
        lbx.changeName("pily");
        System.out.println(lbx.getName());
        lbx.close();

        lbx.changeName("pilki");
        System.out.println(lbx.getName());

        if (true)
            return;


        // symulacja dostepu do bazy danych

        Picture pic1 = new Picture("1", 10,  new String[]{"piła", "drewno"},  true);
        Picture pic2 = new Picture("2", 10, new String[]{"piła", "drewno"}, true);
        Picture pic3 = new Picture("3", 10,  new String[]{"piła", "drewno"}, true);

       // Client client2 = new Client("Zenobiusz", "ul. X", 0);

        Reservation reservation = new Reservation(client);

        //=========================================

        reservation.add(pic1);
        reservation.add(pic2);
        reservation.add(pic3);

        // sytucacja niedozwolona
        reservation.add(pic1);
        reservation.add(pic2);
        reservation.add(pic3);

        int count = reservation.getItemsCount();
        System.out.println(reservation.getItemsCount());

        Offer offer = reservation.generateOffer();
        double offerTotalCost = offer.getTotalCost();
        boolean canAfford = client.canAfford(offerTotalCost);

        if(canAfford){
            client.charge(offerTotalCost, "Za zdjecia");
            List<Product> items = offer.getItems();
            Purchase purchase = new Purchase(client, new Picture[]{pic1});//// TODO: 10.03.2016 przepakowac z oferty do zakupu
        }else{
            System.out.println("Can not afford! You need " + offerTotalCost);
            return;
        }


        LightBox lightBox1 = new LightBox();
        LightBox lightBox2 = new LightBox();
        LightBox lightBox3 = new LightBox();

        Picture pictureSaw = new Picture();
        lightBox1.add(pictureSaw);

    }
*/
}
