package pl.com.bottega.commons.math.probability;

/**
 * Created by bernard.boguszewski on 16.04.2016.
 */
public class Probability {

    public enum ProbabilityRepresentation {
        PERC, FRAC;
    }

    private double value;

    private Probability(double value) {
        this.value = value;
    }


    public static Probability fromFraction(double value) {
        if (value < 0 || value > 1)
            throw new IllegalArgumentException("value must be <0,1>");
        return new Probability(value);
    }

    public static Probability fromPercentage(double value) {
        if (value < 0 || value > 100)
            throw new IllegalArgumentException("value must be <0,100>");
        return new Probability(value/100);
    }

    public Probability and(Probability v2) {
        return new Probability(value * v2.value);
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }


}
