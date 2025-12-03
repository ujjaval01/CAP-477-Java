package genericPractice;

/* Isnme hum kisi bhi genric methods ko boundry me bnd kr skte h, jaise we want this method
   only support numbers, then we want to bound this like below example....*/

public class BoundedGeneric {
    static void main() {
        display("saini");
        BoundedGeneric b = new BoundedGeneric();
//        b.duguna("ujvl");   //getting error due to string asign value
        b.duguna(55);


    }

    static <A> void display(A id){
        System.out.println(id);
    }
    public <E extends Number> void duguna(E id){
        System.out.println(id);

    }

}
