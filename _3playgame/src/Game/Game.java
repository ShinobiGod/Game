package Game;
import  java.util.Random;

public class Game {
    public  static  void  main(String[] args){
        Guess hu = new Guess();
        Random random = new Random();
        int randomInt = random.nextInt( 5);

        hu.guess(1,  3, 2);

        if(hu.guess1 == randomInt){
            System.out.println(" Player One is the winner");
        } else if (hu.guess2 == randomInt) {
            System.out.println("Player two is the winner");

        } else if (hu.guess3 == randomInt) {
            System.out.println("Player 3 is the winner");
        } else {
            System.out.println("No winner in this round");
        }
    }
}
