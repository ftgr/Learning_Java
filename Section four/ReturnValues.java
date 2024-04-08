public class ReturnValues {
    public static void main(String[] args) {
        double area = calculateArea(3.2, 4.2);
        System.out.println("The rectangle area is " + area);

        String englishAreaExplanation = explainArea("English");
        System.out.println(englishAreaExplanation);
    }

    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "Area equals length * width";
            case "French":
                return "La surface est egale a la longueur * la largeur";
            case "Spanish":
                return "area es igual a largo * ancho";
            default:
                return "Language not supported";
        }
    }

    // English "Area equals length * width"
    // French "La surface est egale a la longueur * la largeur"
    // Spanish "area es igual a largo * ancho"

}
