package pl.com.bottega.commons.math;

import static pl.com.bottega.commons.math.Fraction.*;

/**
 * Created by bernard.boguszewski on 19.03.2016.
 */
public class FractionTestConsoleApp {
    public static void main(String[] args) {
        Fraction f1;
        Fraction f2;
        f2 = new Fraction(2);
        try {
            f1 = new Fraction(2000, 111);
        }catch(IllegalArgumentException ex){
            System.out.println("Złe dane wejściowe!" + ex.getMessage());
            return;
        }


        // Fraction onePrim = new Fraction(1,1);

        // Fraction sum = f1.add(f2).add(ONE).add(ZERO); // wzorzec projektowy Value Object (immutability)

        //Fraction f3 = new Fraction(23);

        System.out.println(f1.toString());
    }
}
