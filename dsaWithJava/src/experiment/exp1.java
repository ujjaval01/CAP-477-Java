package exp;

import org.w3c.dom.ls.LSOutput;

class a{
    int sum(){
        int a = 5, b =4;
        return a+b;
    }
}


public class exp1 {
    public static void main(String[] args) {
        a obj = new a();
        int a = obj.sum();
        System.out.println(a);
    }

}
