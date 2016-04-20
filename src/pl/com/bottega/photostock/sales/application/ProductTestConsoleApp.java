package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientStatus;
import pl.com.bottega.photostock.sales.model.Offer;
import pl.com.bottega.photostock.sales.model.Reservation;
import pl.com.bottega.photostock.sales.model.products.Clip;
import pl.com.bottega.photostock.sales.model.products.Picture;
import pl.com.bottega.photostock.sales.model.products.Song;

/**
 * Created by bernard.boguszewski on 03.04.2016.
 */
public class ProductTestConsoleApp {
    /*
    public static void main(String[] args) {
        Client panJan = new Client("Jan", "Ziemia", ClientStatus.STANDARD, 100);

        Picture water = new Picture("nr1", 11, new String[]{"water", "sea"}, true);
        Picture boy = new Picture("nr2", 12, new String[]{"boy", "human"}, true);

        Clip newCarlosSantanaClip = new Clip("Smooth", 4.17, 20, "avi", "1280x720", new String[]{"Santana", "Supernatural"}, "Carlos Santana", true);
        Clip newTheKillersClip = new Clip("Mr Brightside", 3.47, 25, "avi", "1280x720", new String[]{"The Killers", "Hot Fuss"}, "The Killers", true);

        Song smooth = new Song("Smooth", 4.17, 10, "mp3", "320kbps", new String[]{"Santana", "Supernatural"}, "Carlos Santana", true);
        Song mrBrightside = new Song("Mr Brightside", 3.47, 15, "mp3", "320kbps", new String[]{"The Killers", "Hot Fuss"}, "The Killers", true);

        Reservation reservationForJohn = new Reservation(panJan);

        reservationForJohn.add(water);
        reservationForJohn.add(boy);
        reservationForJohn.add(newCarlosSantanaClip);
        reservationForJohn.add(newTheKillersClip);
        reservationForJohn.add(smooth);
        reservationForJohn.add(mrBrightside);

        Offer offerForJohn = reservationForJohn.generateOffer();
        System.out.println("Items: " + offerForJohn.getItemsCount());
        System.out.println("Price: " + offerForJohn.getTotalCost());

    }
    */
}
