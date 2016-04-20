package pl.com.bottega.commons.math;


import java.util.Arrays;

/**
 * Created by bernard.boguszewski on 22.03.2016.
 */
public class Sorter {

    public static void sortInPlace(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp;
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    public static int[] sort(int[] number) {
        int[] new_numbers = Arrays.copyOf(number, number.length);
        sortInPlace(new_numbers);
        return new_numbers;
    }


}
