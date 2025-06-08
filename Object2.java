public class Object2 {
    public static void main(String[] args) {

        // Object2 obj = new Object2();
        // obj.p

        SweetProduct sp = new SweetProduct();
        sp.swPurchase();
        System.out.println("");
        SaltProduct spp = new SaltProduct();
        spp.saPurchase();
        
        
    }
}

class SweetProduct{
    String name  = "suger";
    double price = 44d;   // rs
    double quantity = 5;  // kg
    void swPurchase(){
        System.out.println("you buy a "+ quantity + "kg suger");
    }

}

class SaltProduct{
    String name = "namkeen";
    double price = 50;
    double quantity = 5;
    void saPurchase(){
        System.out.println("you buy a "+ quantity + "kg namkeen" );
    }

    
void p(){
    System.out.println("hello");
}

}


