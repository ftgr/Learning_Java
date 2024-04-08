public class ReturnValues {
    public static void main(String[] args) {
        double area = calculateArea(3.2, 4.2);
        System.out.println("The rectangle area is " + area);
    }
    
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
    
}
