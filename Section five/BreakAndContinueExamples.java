public class BreakAndContinueExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10, but stop when the number 5 is reached (using break)
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Example 2: Print numbers from 1 to 10, but skip the number 5 (using continue)
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        for (int i = 21; i <= 100; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }

        // Example 4: Print all even numbers from 1 to 20, and skip odd numbers (using continue)
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}