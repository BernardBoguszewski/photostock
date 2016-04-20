package pl.com.bottega.commons.math;

/**
 * Created by bernard.boguszewski on 19.03.2016.
 */
public class Fraction {
    //stała, constant
    public static final Fraction ONE = new Fraction(1, 1);
    public static final Fraction ZERO = new Fraction(0, 1);

    private final int nominator;
    private final int denominator;

    /**
     * Klasa modeluje ułamek
     *
     * @param nominator   licznik ułamka
     * @param denominator mianownik ułamka
     * @throws IllegalArgumentException gdy mianownik jest równy 0
     */
    public Fraction(int nominator, int denominator) throws IllegalArgumentException {
        if (denominator == 0)
            throw new IllegalArgumentException("Denominator can not be zero");
        this.nominator = nominator;
        this.denominator = denominator;

    }

    public Fraction(int nominator) {
        //this(nominator, 10); nie chcemy walidować liczby 10
        this.nominator = nominator;
        this.denominator = 10;
    }

    /**
     * @param literal ułamek w preprezentacji licznik/mianownik np. 3/4
     */
    public Fraction(String literal) throws IllegalArgumentException {
        String[] parts = literal.split("/");
        if (parts.length != 2)
            throw new IllegalArgumentException("To nie jest ułamek!");

        try {
            nominator = Integer.parseInt(parts[0]);
            denominator = Integer.parseInt(parts[1]);
            if (denominator == 0)
                throw new IllegalArgumentException("Nie może być zera w mianowniku!");
        } catch (NumberFormatException ex) {       //nie musimy przepakować tego, możemy rzucić NFE
            throw new NumberFormatException("To nie jest ułamek!" + ex);
        }

    }

    public Fraction add(Fraction addend) {
        if (this.denominator == addend.denominator) {
            int nominatorSum = this.nominator + addend.nominator;
            return new Fraction(nominatorSum, denominator);
        } else {
            int commonDenominator = this.denominator * addend.denominator;
            int thisNominator = this.nominator * addend.denominator;
            int addendNominator = addend.nominator * this.denominator;
            return new Fraction(thisNominator + addendNominator, commonDenominator);
        }
    }


    public Fraction reverseV2() throws IllegalStateException {
        if (this.nominator == 0)
            throw new IllegalStateException("Can not reverse zero");
        return new Fraction(this.denominator, this.nominator);
    }

    public Fraction reverse() throws IllegalStateException {
        try {
            return new Fraction(this.denominator, this.nominator);
        } catch (IllegalArgumentException ex) {
            throw new IllegalStateException("Zero can not be reversed", ex);
        }
    }

    private String getSpace(int n) {
        String spaces = new String();
        for (int i = 0; i < n; i++) {
            spaces += " ";
        }
        return spaces;
    }

    private String getLine(int n) {
        String spaces = new String();
        for (int i = 0; i < n; i++) {
            spaces += "-";
        }
        return spaces;
    }

    public String toString() {
        String fractionString = new String();
        int quotient = nominator / denominator;
        int newNominator = nominator % denominator;
        int denominatorLength = String.valueOf(denominator).length();
        int newNominatorLength = String.valueOf(newNominator).length();
        int newNominatorPosition = (denominatorLength - newNominatorLength) / 2;
        int quotientLength = String.valueOf(quotient).length();
        if (newNominator == 0)
            fractionString = String.valueOf(quotient);
        else if (quotient == 0)
            fractionString = String.valueOf(newNominator) + "\n" + getLine(denominatorLength) + "\n" + String.valueOf(denominator);
        else
            fractionString = getSpace(quotientLength + newNominatorPosition) + String.valueOf(newNominator) + "\n" +
                    quotient + getLine(denominatorLength) + "\n" +
                    getSpace(quotientLength) + String.valueOf(denominator);
        return fractionString;
    }

}