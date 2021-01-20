package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]){
        Random random = new Random();
        int totalRoll = 5;
        int boardSpace = 20;
        int space=0;

        for (int i=0; i<totalRoll; i++) {
            int die = random.nextInt(6) + 1;
            space = space + die;
            int spaceRemaining = boardSpace - die;
            boardSpace = spaceRemaining;
            if (i == 4 && (space != 20)) {
                System.out.println("Roll #" + (i + 1) + " You have rolled a " + die + ". You are now on space " + space +
                        " You lose!!!");
            } else if (space == 20) {
                System.out.println("Roll #" + (i + 1) + " You have rolled a " + die + ". You are now on space " + space +
                        " Congrats. You win!!!");
            } else {
                System.out.println("Roll #" + (i + 1) + " You have rolled a " + die + ". You are now on space " + space +
                        " and have " + spaceRemaining + " more to go");
            }
        }
    }
}
