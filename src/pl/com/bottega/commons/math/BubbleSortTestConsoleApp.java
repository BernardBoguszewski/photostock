package pl.com.bottega.commons.math;



/**
 * Created by bernard.boguszewski on 22.03.2016.
 */
public class BubbleSortTestConsoleApp {
    public static void main(String[] args) {

        int[] numbers = Utils.convert(args);
        Sorter.sortInPlace(numbers);
        Utils.display(numbers);

    }
}
