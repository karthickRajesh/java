package chapter4;

import java.util.Random;

public class AssignmentChapter3RollTheDiegame {

    public static void main(String[] args) {

        int target = 20;
        int count = 0;
        for (int i=0 ; i<5 ; i++){
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            System.out.println(die);
            count = count + die;

            if (count >20){
                System.out.println("You've rolled a " + die + ". You have crossed "+ target+" spaces so You lost");
                break;
            } else{
                System.out.println("You've rolled a " + die + ". You are now on space " +count +" and have " + (target-count) +" more to go.");

            }
            if (count == target){
                System.out.println(" You Have Won the game");
                break;
            }
        }
        if (count <target) {
            System.out.println(" You Have Lost the game as u have not moved to 20 spaces");

        }
    }
}
