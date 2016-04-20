package pl.com.bottega.commons.math;

/**
 * Created by bernard.boguszewski on 24.03.2016.
 */
public class Utils {

    public static int[] convert(String[] args){
        int[] numbers = new int[args.length];
        for(int i=0; i<args.length; i++){
            numbers[i]=Integer.parseInt(args[i]);
        }
        return numbers;
    }

    public static void display(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
