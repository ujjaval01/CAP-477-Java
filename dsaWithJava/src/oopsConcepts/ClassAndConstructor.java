package oopsConcepts;

class Car{
    String name;
    private double len;
    private int price;
    Car(String name, double len, int price){     // constructor works as a setter method
        this.name = name;
        this.len = len;
        this.price = price;
    }
    public void setLen(double len){
        this.len = len;
    }
    public int getPrice(){
        return price;
    }
    void print(){
        System.out.println(name+ " " + len+"m " + price);
    }
}

public class ClassAndConstructor {
    static void main() {
        Car c1 = new Car("Lord Alto", 3.55, 400000);
        c1.setLen(4.4);
        c1.print();
        System.out.println(c1.getPrice());

    }
}
