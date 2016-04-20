package pl.com.bottega.photostock.sales.application;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import pl.com.bottega.photostock.sales.model.Client;
import pl.com.bottega.photostock.sales.model.ClientStatus;
import pl.com.bottega.photostock.sales.model.VIPClient;

/**
 * Created by bernard.boguszewski on 13.03.2016.
 */
public class ClientTestConsoleApp {

    public static void main(String[] args) {
        /*
        Client panJanusz =new Client("Janusz", "Księżyc", false, 4, 0);
        panJanusz.recharge(10);
        if(panJanusz.canAfford(12)) {
            panJanusz.charge(12, "za coś");
            System.out.println("Saldo: " + panJanusz.getSaldo());
        }else{
            System.out.println("can not afford!");
        }

        Client panMarek = new Client("Marek", "Mars", ClientStatus.VIP, 10, 10);
        panMarek.charge(12, "za niewinność");
        panMarek.getSaldo();
        System.out.println(panMarek.getSaldo());
        Client panJan = new Client("Jan", "Ziemia", ClientStatus.GOLD);
        System.out.println(panJan.introduce());
        */

        VIPClient panJanusz = new VIPClient("Janusz", "USA", 20, 5);
        panJanusz.charge(21, "opłata");
        System.out.println(panJanusz.getSaldo());




    }
}
