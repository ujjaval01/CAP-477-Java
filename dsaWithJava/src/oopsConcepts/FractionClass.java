package oopsConcepts;

class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
    }
    void print(){
        System.out.println(num + "/" + den);
    }
    public void add(Fraction f){
       num = num*f.den + den*f.num;
       den = den * f.den;
       simplify();
    }
    public void sub(Fraction f){
        num = num*f.den - den*f.num;
        den = den * f.den;
        simplify();
    }
    public void multi(Fraction f){
        num = num * f.num;
        den = den * f.den;
        simplify();
    }
    public void divide(Fraction f){
        num = num * f.den;
        den = den * f.num;
    }
    public void simplify(){
        int gcd = hcf(num, den);
        num = num/gcd;
        den = den/gcd;
    }
    public int hcf(int a, int b){
        if(a == 0) return b;
        return hcf(b%a, a);
    }
}

// This solution provided from the side of chatGpt, its very clean and optimized version of the fraction...

//class Fraction {
//    int num;   // numerator
//    int den;   // denominator
//
//    Fraction(int num, int den) {
//        if (den == 0) {
//            throw new IllegalArgumentException("Denominator cannot be zero");
//        }
//
//        // Normalize sign (den always positive)
//        if (den < 0) {
//            num = -num;
//            den = -den;
//        }
//
//        this.num = num;
//        this.den = den;
//
//        simplify();
//    }
//
//    Fraction add(Fraction f) {
//        int newNum = this.num * f.den + this.den * f.num;
//        int newDen = this.den * f.den;
//        return new Fraction(newNum, newDen);
//    }
//
//    Fraction sub(Fraction f) {
//        int newNum = this.num * f.den - this.den * f.num;
//        int newDen = this.den * f.den;
//        return new Fraction(newNum, newDen);
//    }
//
//    Fraction multi(Fraction f) {
//        int newNum = this.num * f.num;
//        int newDen = this.den * f.den;
//        return new Fraction(newNum, newDen);
//    }
//
//    Fraction divide(Fraction f) {
//        if (f.num == 0) {
//            throw new IllegalArgumentException("Cannot divide by zero fraction");
//        }
//        int newNum = this.num * f.den;
//        int newDen = this.den * f.num;
//        return new Fraction(newNum, newDen);
//    }
//
//    private void simplify() {
//        int g = hcf(Math.abs(num), Math.abs(den));
//        num /= g;
//        den /= g;
//    }
//
//    private int hcf(int a, int b) {
//        if (a == 0) return b;
//        return hcf(b % a, a);
//    }
//
//    void print() {
//        System.out.println(num + "/" + den);
//    }
//}


public class FractionClass {
    static void main() {
        Fraction f1 = new Fraction(2,4);
        Fraction f2 = new Fraction(2,4);
        f1.add(f2);
        f1.print();

//        Fraction f3 = new Fraction(100, 50);
//        f3.print();


    }
}
