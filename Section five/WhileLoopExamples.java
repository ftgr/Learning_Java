public class WhileLoopExamples {

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        int diceRoll = 1; // initialize to any number other than 6
        while (diceRoll != 6) {
            diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);
        }

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        int randomNumber = 0;
        while (randomNumber <= 90) {
            randomNumber = generateRandomNumber();
            System.out.println("Random number: " + randomNumber);
        }

        // Example 3: Keep doubling a random number until it's greater than 1000
        while (randomNumber <= 1000) {
            randomNumber = randomNumber * 2;
            System.out.println("Doubled random number: " + randomNumber);
        }
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}