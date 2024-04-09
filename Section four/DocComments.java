public class DocComments {
    public static void main(String[] args) {

    }

    /** 
     * Function name: greet
     * Inside de function:
     *  1. Prints "Hello!"
     */
    public static void greet() {
        System.out.println("Hello!");
    }

    /**
     * Function name: printText
     * @param name (String).
     * @param age (String).
     * Inside the function:
     *  1. Prints "My name is <name> and I am <age> years old."
    */
    public static void printText(String name , String age) {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    };

    /**
     * Function name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     * Inside the function:
     *  1. Calculates and returns the area of a rectangle
     */
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}