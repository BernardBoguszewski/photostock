package pl.com.bottega.photostock.sales.model;

/**
 * Created by bernard.boguszewski on 03.04.2016.
 */
public enum ClientStatus {
    STANDARD, VIP, GOLD, SILVER, PLATINUM;

    public static final String[] DICTIONARY = {"Standardowy", "Bardzo ważna osoba", "Złoty", "Srebrny", "Platynowy"};


    public String getPolishString(ClientStatus status){
        return DICTIONARY[status.ordinal()];
    }
}
