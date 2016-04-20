package pl.com.bottega.photostock.sales.application;

import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientStatus;
import pl.com.bottega.photostock.sales.model.LightBox;
import pl.com.bottega.photostock.sales.model.ProductNotAvailableException;
import pl.com.bottega.photostock.sales.model.products.Picture;

/**
 * Created by bernard.boguszewski on 19.03.2016.
 */
public class LightboxTestConsoleApp {
    /*
    public static void main(String[] args) {
        Client panJanusz = new Client("Janusz", "Mars", ClientStatus.STANDARD, 17);
        LightBox lightBoxJanusza = new LightBox(panJanusz);
        Picture lumberJack = new Picture("lumberJack", 17, jpg, new String[]{"lumber"}, "me", true, "1");
        Picture kitty = new Picture("nr2", 2,"jpg",new String[]{"ble"},"aut", true,"2");

        try {
            lightBoxJanusza.add(lumberJack);
            lightBoxJanusza.close();
            lightBoxJanusza.add(kitty);
            lightBoxJanusza.add(lumberJack);
        } catch (IllegalStateException ex) {
            System.out.println("Nie udało się " + ex.getLocalizedMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println("Nie udało się bo " + ex);
        } finally {
            System.out.println("Gratulacje"); // wykona się zawsze, bez względu czy był wyjątek czy nie
        }
        int count = lightBoxJanusza.getItemsCount();
        System.out.println(count);
    }
*/

    public static void main(String[] args) {
        Client panJan = new Client("Jan", "Ziemia");
        LightBox lightBoxJana = new LightBox(panJan);
        Picture wood = new Picture("df", 17, ".jpg", new String[]{"sadas"}, "asdsad", false, "nr1");
        try{
            lightBoxJana.add(wood);
        }
        catch(ProductNotAvailableException ex){
            System.out.println("Product is not available!");
        }
    }
}