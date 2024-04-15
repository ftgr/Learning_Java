import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Let's play Rolling Java. Type anything to start.");
        String startString = scan.nextLine();
        System.out.println("Great, here are the rules:\n");
        System.out.println(" - If you roll a 6 the game stops.");
        System.out.println(" - If you roll a 4 nothing happens.");
        System.out.println(" - Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points. Enter anything to roll:");
        String rollString = scan.nextLine();

        int score = 0;

        while (true)  {
            if (rollString.equals("")) {
                break;
            }
            int diceRoll = rollDice();
            System.out.print("You rolled a "+diceRoll+". ");
            if (diceRoll == 6) {
                System.out.println("End of game.");
                break;
            } else if (diceRoll == 4) {
                System.out.println("Zero points. Keep rolling.");
                continue;
            } else {
                score++;
                System.out.println("One point. Keep rolling.");    
            }
            rollString = scan.nextLine();
        }
        System.out.println("\nYour score is: " + score);

        if (score >= 3) {
            System.out.println("Wow, that's lucky. You win!");
        } else {
            System.out.println("Tough luck, you lose :( ");
        }
        
        public static int rollDice() {
            double randomNumber = Math.random() * 6;
            randomNumber += 1;
            return (int)randomNumber;
        }

    }

}
