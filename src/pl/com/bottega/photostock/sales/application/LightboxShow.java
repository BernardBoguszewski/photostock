package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientStatus;
import pl.com.bottega.photostock.sales.model.LightBox;
import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bernard.boguszewski on 24.03.2016.
 */
public class LightboxShow {

    public static void main(String[] args) {
        /*
        Client panJanusz = new Client("Janusz", "Mars", ClientStatus.STANDARD, 17);
        Client panMarek = new Client("Marek", "Ziemia", ClientStatus.STANDARD, 20);
        Client panJan = new Client("Jan", "Słońce", ClientStatus.STANDARD, 21);

        LightBox lightBoxJanusza = new LightBox("Moje ulubione", panJanusz);
        LightBox lightBoxMarka = new LightBox("Fajne zdjęcia", panMarek);
        LightBox lightBoxJana = new LightBox("Najlepsze", panJan);

        Picture lumberJack = new Picture("nr1", 2, null, true);
        Picture kitty = new Picture("nr2", 2, null, true);
        Picture human = new Picture("nr3", 3, null, true);
        Picture woman = new Picture("nr4", 4, null, true);
        Picture moon = new Picture("nr5", 5, null, true);
        Picture water = new Picture("nr6", 6, null, true);

        try {
            lightBoxJanusza.add(lumberJack);
            lightBoxJanusza.add(kitty);
            lightBoxMarka.add(human);
            lightBoxMarka.add(woman);
            lightBoxJana.add(moon);
            lightBoxJana.add(water);
        } catch (IllegalStateException ex) {
            System.out.println("Nie udało się " + ex);
        } catch (IllegalArgumentException ex) {
            System.out.println("Nie udało się bo" + ex);
        }


        List<LightBox> lightBoxes = new ArrayList<>();
        lightBoxes.add(lightBoxJanusza);
        lightBoxes.add(lightBoxMarka);
        lightBoxes.add(lightBoxJana);
        int number = 1; //do wyświetlania kolejnych numerów LightBoxów
        for (LightBox lbx : lightBoxes) {
            System.out.println(number++ + "." + lbx.getName() + " - " + lbx.getOwnerName());
            for (Picture pic : lbx.getPictures()) {
                if (pic.isAvailable())
                    System.out.println("  " + pic.getNumber() + " | " + pic.getPrice());
                else
                    System.out.println("X " + pic.getNumber() + " | " + pic.getPrice());
            }
            if (number <= lightBoxes.size())
                System.out.println("===================================");
        }

        System.out.println("\n");
        System.out.println("Polaczenie wszystkich lightboxow: \n");

        LightBox bigLightBox = LightBox.newLbxAdd(lightBoxes);
        LightBox.show(bigLightBox);
*/

    }
}
