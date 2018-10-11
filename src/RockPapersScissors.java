import java.util.Scanner;

public class RockPapersScissors {


    public static void main(String[] args) {


        Scanner keyboard;

        String rock, paper, scissors;
        String weaponpicked;
        String[] options = {"rock", "scissors", "paper"};
        String computerChoice;
        int number;
        String again;

        keyboard = new Scanner(System.in);
        do {
            again = "";

            System.out.println("Welcome to the Rock Paper scissors Samurai battle ");
            System.out.println("Choose your weapon young samurai(rock, paper, scissors) choose wisely");
            weaponpicked = keyboard.nextLine();
            number = (int) (Math.random() * 3);
            computerChoice = options[number];


            System.out.println("Sensei chose " + computerChoice);

            if (weaponpicked.equals(computerChoice) ) {
                System.out.println("It's a draw");

            } else {
                if(weaponpicked.equals("rock")){
                    if(computerChoice.equals("paper")){
                        System.out.println("Paper beats Rock: Sensei wins");

                    }
                    else{
                        System.out.println("Rock beats Scissors: Samurai Wins");
                    }
                }
                if(weaponpicked.equals("paper")){
                    if(computerChoice.equals("scissors")){
                        System.out.println("Scissors beat Paper: Sensei wins");

                    }
                    else{
                        System.out.println("Paper beats Rock: Samurai Wins");
                    }
                }
                if(weaponpicked.equals("scissors")){
                    if(computerChoice.equals("rock")){
                        System.out.println("Rock beats Scissors: Sensei wins");

                    }
                    else{
                        System.out.println("Scissors beat Rock: Samurai Wins");
                    }
                }

            }System.out.println("Would you like to challenge me again? (yes or no)");
            again = keyboard.next().toLowerCase();
        }while(again.equals("yes"));
        System.out.println("if you lose today, win tomorrow. In this never-ending spirit of challenge is found in the" +
                " heart of a victor");
    }

}