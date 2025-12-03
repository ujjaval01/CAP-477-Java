package genericPractice;

public class SimpleEx {
    static void main(String[] args) {
//        animal<String> cat = new animal<>("cat");
//        animal<Integer> id = new animal<>(11);
//        cat.display();
//        id.display();



        Dog<String> d = new Dog<>("Ujjaval");
        Dog<Integer> d1 = new Dog<>(6);
//        String res = d.getId();
        System.out.println(d.getId());
        System.out.println(d1.getId());

    }
}
//class animal<T>{
//    T id;
//    animal(T id){
//        this.id = id;
//    }
//    void display(){
//        System.out.println(id);
//    }
//}


class Dog<T>{
    T id;
    Dog(T id){
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
