package pl.com.bottega.commons.math.formatter;

import java.util.*;


/**
 * Created by bernard.boguszewski on 02.04.2016.
 */
public class Formatter {

    public enum FormattingLanguage {
        PL, EN;
    }


    List<Byte> digits = new ArrayList<>();

   /* public Formatter(Long number){
        while(number != 0){
            Long digit = number % 10;
            digits.add((byte)digit);
            number /= 10;
             Collections.reverse(digits);
        }
    }*/

    public Formatter(long number) {
        recursiveCutter(number);
        Collections.reverse(digits);
    }

    public void recursiveCutter(long number) {
        long digit = number % 10;
        digits.add((byte) digit);
        long newValue = number / 10;
        if (newValue != 0)
            recursiveCutter(newValue);
    }

    public String formatNumbers(String lang) {
        return null;
    }

    public String[] formatDigits(FormattingLanguage lang) {
        String[] result = new String[digits.size()];
        int nr = 0;
        for (Byte digit : digits) {
            result[nr++] = generateDigit2(digit, lang);
        }
        return result;
    }


    private String generateDigit(Byte digit, String lang) {
        switch (lang) {
            case "pl":
                switch (digit) {
                    case 0:
                        return "zero";
                    case 1:
                        return "jeden";
                    case 2:
                        return "dwa";
                    case 3:
                        return "trzy";
                    case 4:
                        return "cztery";
                    case 5:
                        return "piec";
                    case 6:
                        return "szesc";
                    case 7:
                        return "siedem";
                    case 8:
                        return "osiem";
                    case 9:
                        return "dziewiec";
                }
                break;
            case "en":
                return "i don't know sir";
            default:
                throw new IllegalArgumentException(lang + "is not supported");
        }
        throw new RuntimeException("cos dziwnego z danymi" + lang + " " + digit);
    }

    private static final String[][] DICTIONARY = {
            {"zero", "jeden", "dwa", "trzy", "cztery", "piec", "szesc", "siedem", "osiem", "dziewiec" },
            {"zero", "one", "two", "t", "four", "five", "six", "seven", "eight", "nine" }
    };

    private String generateDigit2(Byte digit, FormattingLanguage lang) {
        byte langNr;
        /*switch (lang) {
            case PL:
                langNr = 0;
                break;
            case EN:
                langNr = 1;
                break;
            default:
                throw new IllegalArgumentException(lang + "is not supported");
        }*/
        return DICTIONARY[lang.ordinal()][digit];
    }
}
//guava i apache commons