package genericPractice;

public class SimpleEx {
    static void main(String[] args) {
        Dog<String> d = new Dog<>("Ujjaval");
        Dog<Integer> d1 = new Dog<>(6);
//        String res = d.getId();
        System.out.println(d.getId());
        System.out.println(d1.getId());

    }
}

class Dog<T>{
    T id;
    Dog(T id){
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
