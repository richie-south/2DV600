package rs222kn_assign1.Fraction;

import java.io.IOException;

/**
 * Created by richardsoderman on 2016-09-07.
 */
public class Fraction {

    private int n;
    private int d;

    public Fraction(int n, int d){
        if(d != 0){
            this.n = n;
            this.d = d;
        }
        else{
            System.out.println("Value incorecct!");
            System.exit(0);
        }
    }

    public int getNumerator(){
        return n;
    }

    public int getDenominator(){
        return d;
    }


    public boolean isNegative(){
        return (double)n/(double) d < 0;
    }

    public Fraction add(Fraction fraction){
        return new Fraction((fraction.getNumerator()*d + n*fraction.getDenominator()) , (fraction.getDenominator()*d));
    }

    public Fraction subtract(Fraction fraction){
        return new Fraction ((n*fraction.getDenominator() - fraction.getNumerator()*d) , (d*fraction.getDenominator()));
    }

    public Fraction multiply(Fraction fraction){
        return new Fraction((fraction.getNumerator()*n) , (fraction.getDenominator()*d));
    }

    public Fraction divide(Fraction fraction){
        return new Fraction((fraction.getNumerator()*d) , (fraction.getDenominator()*n));
    }


    public boolean isEqualTo(Fraction fraction){
        return (double)n/d == (double)fraction.getNumerator()/fraction.getDenominator();
    }

    public String toString(){
        return n+"/"+d;
    }
}
