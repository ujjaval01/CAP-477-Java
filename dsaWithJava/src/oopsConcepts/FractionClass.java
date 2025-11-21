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
