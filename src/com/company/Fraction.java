package com.company;

public class Fraction {

    private int numerator;
    private int denominator;

    //конструктор
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //toString
    @Override
    public String toString() {
        return numerator + "\n" + "-" + "\n" + denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //сумма дробей
    public static Fraction sum(Fraction a, Fraction b){
        int resultDenominator = NOD_NOK.nok(a.denominator, b.denominator);
        int resultNumerator = a.numerator * (resultDenominator / a.denominator)
                            + b.numerator * (resultDenominator / b.denominator);
        int tmpNOD = NOD_NOK.nod(resultNumerator, resultDenominator);
        Fraction fraction = new Fraction(resultNumerator / tmpNOD, resultDenominator / tmpNOD);
        return fraction;
    }
    //умножение дробей
    public static Fraction umnogenie(Fraction a, Fraction b){
        int resultDenominator = a.denominator * b.denominator;
        int resultNumerator = a.numerator * b.numerator;
        int tmpNOD = NOD_NOK.nod(resultNumerator, resultDenominator);
        Fraction fraction = new Fraction(resultNumerator / tmpNOD, resultDenominator / tmpNOD);
        return fraction;
    }
    //вычитание дробей
    public static Fraction minus(Fraction a, Fraction b){
        int resultDenominator = NOD_NOK.nok(a.denominator, b.denominator);
        int resultNumerator = a.numerator * (resultDenominator / a.denominator)
                - b.numerator * (resultDenominator / b.denominator);
        int tmpNOD = NOD_NOK.nod(resultNumerator, resultDenominator);
        Fraction fraction = new Fraction(resultNumerator / tmpNOD, resultDenominator / tmpNOD);
        return fraction;
    }
    //деление дробей
    public static Fraction delenie(Fraction a, Fraction b){
        return umnogenie(a,new Fraction(b.denominator, b.numerator));
    }
}
