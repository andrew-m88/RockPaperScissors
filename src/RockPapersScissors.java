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
        int senseiScore,samuraiScore;
        samuraiScore = 0;
        senseiScore = 0;

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
                        senseiScore +=1;
                        System.out.println("The sensei's score is "+senseiScore);

                    }
                    else{
                        System.out.println("Rock beats Scissors: Samurai Wins");
                        samuraiScore +=1;
                        System.out.println("Your score is "+samuraiScore);
                    }
                }
                if(weaponpicked.equals("paper")){
                    if(computerChoice.equals("scissors")){
                        System.out.println("Scissors beat Paper: Sensei wins");
                        senseiScore +=1;
                        System.out.println("The sensei's score is "+senseiScore);

                    }
                    else{
                        System.out.println("Paper beats Rock: Samurai Wins");
                        samuraiScore +=1;
                        System.out.println("Your score is "+samuraiScore);
                    }
                }
                if(weaponpicked.equals("scissors")){
                    if(computerChoice.equals("rock")){
                        System.out.println("Rock beats Scissors: Sensei wins");
                        senseiScore +=1;
                        System.out.println("The sensei's score is "+senseiScore);

                    }
                    else{
                        System.out.println("Scissors beat Paper: Samurai Wins");
                        samuraiScore +=1;
                        System.out.println("Your score is "+samuraiScore);
                    }
                }

            }System.out.println("Would you like to challenge me again? (yes or no)");
            again = keyboard.nextLine().toLowerCase();
        }while(again.equals("yes"));

        System.out.println("The Sensei's final score is "+senseiScore);
        System.out.println("Your final score is "+samuraiScore);

        if(samuraiScore==senseiScore){
            System.out.println("You fought a tough battle");
        }
        else if (samuraiScore>senseiScore){
            System.out.println("strong you are");
        }
        else if (samuraiScore<senseiScore){
            System.out.println("You were a waste of time anyway");
        }
        System.out.println("come back if you dare");
    }


}