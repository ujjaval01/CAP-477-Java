import java.util.ArrayList;
public class MyArrayList {
 public static void main(String[] args) {


ArrayList<ArrayList<String>> grosory = new ArrayList<>();

ArrayList<String> food = new ArrayList<String>();
food.add("tamotas");
food.add("patatos");
food.add("breads");




 ArrayList<String> drink = new ArrayList<String>();
drink.add("cocaCola");
drink.add("pepsi");
drink.add("fruti");

ArrayList<String> fruits = new ArrayList<String>();
fruits.add("banana");
fruits.add("mango");
fruits.add("apple");

grosory.add(food);
grosory.add(drink);
grosory.add(fruits);

System.out.println((grosory.get(0)).getFirst());

 }   
}