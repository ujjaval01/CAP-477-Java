package oopsConcepts;

import java.util.Random;
import java.util.Scanner;

class Game{
    private final int number;
    private int inputNumber;
    private int noOfGuesses;

     public Game(){
        Random rand = new Random();
        number = rand.nextInt(10);
        noOfGuesses = 0;
    }

    public int getNoOfGuesses(){
         return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your gussed number: ");
        inputNumber =  sc.nextInt();
    }

    public boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.println("Yes u get it right.");
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too Low...");
        }else{
            System.out.println("Too Hight...");
        }
        return false;
    }
}

public class ProblemPractice {
    public static void main(String[] args) {
        Game g = new Game();
        boolean result = false;
        while (!result) {
            g.takeUserInput();
            result = g.isCorrectNumber();
        }
        System.out.println("You took " + g.getNoOfGuesses() + " guesses");

        
        
    }
}
