package rs222kn_assign1.Fraction;

import java.io.IOException;

/**
 * Created by richardsoderman on 2016-09-07.
 */
public class FractionMain {
    public static void main(String[] args) throws IOException {
        Fraction f1 = new Fraction(1,1);
        Fraction f2 = new Fraction(1,2);
        Fraction f3 = new Fraction(1,3);
        Fraction te = new Fraction(1,2);
        Fraction te2 = new Fraction(1,2);


        System.out.println("toString: " + f1.toString());

        System.out.println("");
        System.out.println("getNumerator: " + f2.getNumerator());

        System.out.println("");
        System.out.println("getDenominator: " + f2.getDenominator());

        System.out.println("");
        System.out.println("isNegative: " + f2.subtract(f1).isNegative());

        System.out.println("");
        System.out.println("add: " + f2.add(f1));


        System.out.println("");
        System.out.println("subtract: " + f1.subtract(f2));

        System.out.println("");
        System.out.println("multiply: " + f1.multiply(f3));

        System.out.println("");
        System.out.println("divide: " + f2.divide(f3));

        System.out.println("");
        System.out.println("isEqualTo: " + te.isEqualTo(te2));
    }
}
