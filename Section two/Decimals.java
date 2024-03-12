public class Decimals {
    public static void main(String[] args) {
        double percentage = 73.5;
        System.out.println(percentage + " of percentages are made up.");

        //Never use int to do math calculation
        int wallet = 20;
        int people = 3;
        // Printing will return 6 dollars intead of 6.6666666667
        System.out.println("Everyone must pay " + wallet/people + " dollars each.");

        // At least one of the variables must be of double type
        double wallet2 = 20;
        int people2 = 3;
        // Printing will return 6.666666666666667
        System.out.println("Everyone must pay " + wallet2/people2 + " dollars each.");
    }
}
