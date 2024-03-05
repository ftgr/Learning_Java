public class Variables {
    public static void main(String[] args) {
        int passengers = 5;
        System.out.println(passengers);

        int busTickets = passengers;

        System.out.println(busTickets);

        // Max value for a 4 byte Int
        // 2147483647 -> Max value
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        // Above Max value gives an error
        // maxValue + 1 = -2147483648
        int maxValuePlusOne = maxValue + 1;
        System.out.println(maxValuePlusOne);
    }}
