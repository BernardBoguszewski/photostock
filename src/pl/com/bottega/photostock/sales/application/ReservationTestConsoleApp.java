package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.infrastructure.repositories.FakeProductRepository;
import pl.com.bottega.photostock.sales.model.*;
import pl.com.bottega.photostock.sales.model.products.Clip;
import pl.com.bottega.photostock.sales.model.products.Picture;

/**
 * Created by Bernard on 2016-03-14.
 */
public class ReservationTestConsoleApp {

    public static void main(String[] args){

        ProductRepository repository = new FakeProductRepository();
        Product mustang = repository.load("nr1");
        Product mustang2 = repository.load("nr2");
        //Clip wlaczamyNiskieCeny = new Clip("wlaczamy niskie ceny", 1.11, 17, "avi", "1920x1080", new String[]{"MediaExpert"}, "MediaExpert", true);

        Client takiSobieClient = new Client("Zegrzysław", "tajny", ClientStatus.GOLD, 20);

        Reservation reservation = new Reservation(takiSobieClient);

       // reservation.add(wlaczamyNiskieCeny);
        //wlaczamyNiskieCeny.isAvailable();

        try{
            reservation.add(mustang);
            reservation.add(mustang2);
        }
        catch (ProductNotAvailableException ex){

        }

        Offer ofertaDlaZegrzyslawa = reservation.generateOffer();
        int count = ofertaDlaZegrzyslawa.getItemsCount();
        System.out.println("Ilość pozycji w ofercie: " + count);
        for (Product product : ofertaDlaZegrzyslawa.getItems()){
            System.out.println(product.getNumber());
        }






    }


}
