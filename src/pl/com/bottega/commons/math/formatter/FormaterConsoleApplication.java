package pl.com.bottega.commons.math.formatter;


import java.util.Arrays;

/**
 * Created by bernard.boguszewski on 02.04.2016.
 */
public class FormaterConsoleApplication {
    public static void main(String[] args) {
        Formatter formatter1 = new Formatter(123456789123456789l);
        String[] digits = formatter1.formatDigits(Formatter.FormattingLanguage.PL);
        System.out.println(Arrays.toString(digits));

    }
}
