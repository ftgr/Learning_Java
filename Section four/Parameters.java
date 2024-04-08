
public class Parameters {
    public static void main(String[] args) {
    rectangleArea(3, 4);
    rectangleArea(5, 6);
    rectangleArea(7, 8);
    rectangleArea(9, 10);
    
    }
    public static void rectangleArea(int length, int width) {
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
