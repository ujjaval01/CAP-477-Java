package GuessTheNumberGame;

import java.util.Random;
import java.util.Scanner;

class Game{
    private final int number;
    int noOfGuesses = 0;
    int inputNumber;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
       // System.out.println(number);
    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the your guess number: ");
        inputNumber = sc.nextInt();

    }

    boolean isCorrectNumber(){
        noOfGuesses++;
      if(inputNumber == number) {
          System.out.println("You guessed..");
          System.out.println("You take " + noOfGuesses + " attempt.");
          return true;
      }
//      else if ((number == inputNumber +1) || (number == inputNumber +2) || (number == inputNumber +3) || (number == inputNumber +4) || (number == inputNumber +5) || (number == inputNumber +6) || (number == inputNumber +7) || (number == inputNumber +8) || (number == inputNumber +9) || (number == inputNumber +10) ) {
//          System.out.println("You are Too Close approx 10 more...");
//      }
//      else if ((number == inputNumber -1) || (number == inputNumber -2) || (number == inputNumber -3) || (number == inputNumber -4) || (number == inputNumber -5) || (number == inputNumber -6) || (number == inputNumber -7) || (number == inputNumber -8) || (number == inputNumber -9) || (number == inputNumber -10) ) {
//          System.out.println("You are Too Close approx 10 less...");
//      }
      else if (inputNumber > number) {
          System.out.println("Too High");
      }
      else  {
          System.out.println("Too Low");
      }
        return false;
    }
}


public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
