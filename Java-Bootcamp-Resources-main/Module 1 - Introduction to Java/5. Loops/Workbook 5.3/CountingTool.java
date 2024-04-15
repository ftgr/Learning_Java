import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi Timmy! What number would you like to count up to?: ");
        int number = scan.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        scan.close();
    }
}
