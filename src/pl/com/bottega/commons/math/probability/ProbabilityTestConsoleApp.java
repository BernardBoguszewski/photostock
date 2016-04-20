package pl.com.bottega.commons.math.probability;

import static pl.com.bottega.commons.math.probability.Probability.*;
import static pl.com.bottega.commons.math.probability.Probability.ProbabilityRepresentation.FRAC;
import static pl.com.bottega.commons.math.probability.Probability.ProbabilityRepresentation.PERC;


/**
 * Created by bernard.boguszewski on 16.04.2016.
 */
public class ProbabilityTestConsoleApp {
    /*
    public static void main(String[] args) {

        shouldCreateFractionrepresentation();
        canNotCreateFractionRepresentationIfValueGTOne();

        shouldCreatePercentageRepresenation();
        canNotCreatePercentageRepresentationIfValueGTOne();

        shouldCalculateIfDifferentRepresentation();
        shouldEqualsZeroIfOneIsZero();
    }

    private static void shouldEqualsZeroIfOneIsZero() {

    }

    private static void shouldCalculateIfDifferentRepresentation() {

        Probability bothEvents = fromFraction(0.5).and(fromPercentage(50));

        System.out.println("wynik: " + bothEvents);
    }

    private static void canNotCreatePercentageRepresentationIfValueGTOne() {
        try{
            Probability p = fromPercentage(190.5);
            throw new RuntimeException("powinien byc wyjatek");
        }
        catch (IllegalArgumentException ex){

        }
    }

    private static void shouldCreatePercentageRepresenation() {
        Probability p = new Probability(90.5, PERC);
    }

    private static void canNotCreateFractionRepresentationIfValueGTOne() {
        try{
            Probability p = new Probability(1.5, FRAC);
            throw new RuntimeException("powinien byc wyjatek");
        }
        catch(IllegalArgumentException ex){

        }
    }

    private static void shouldCreateFractionrepresentation() {
        Probability p = new Probability(0.5, FRAC);
    }
    */
}
