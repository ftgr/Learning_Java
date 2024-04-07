public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy, snowy)
        // Decide whether to use if-else or switch
        switch (weather) {
            case "sunny":
                System.out.println("You should wear a t-shirt.");
                break;
            case "cloudy":
                System.out.println("You should wear a sweater.");
                break;
            case "rainy":
                System.out.println("You should wear a raincoat.");
                break;
            case "snowy":
                System.out.println("You should wear a jacket.");
                break;        
            default:
                System.out.println("Not sure what to wear.");
                break;
        }

        // Section 2: User role
        int role = 2;
        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3: user)
        // Decide whether to use if-else or switch
        switch (role) {
            case 1:
               System.out.println("You are an admin."); 
                break;
            case 2:
                System.out.println("You are an editor.");
                break;
            case 3:
                System.out.println("You are a user.");
                break;
            default:
                System.out.println("Not sure what you are.");
                break;
        }

        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;
        // Determine the comfort level based on both temperature and humidity (e.g., too hot, too cold, comfortable)
        // Decide whether to use if-else or switch
        if (temperature > 75 && humidity > 65) {
            System.out.println("It's too hot and humid.");
        } else if (temperature > 75 && humidity < 65) {
            System.out.println("It's too hot and not humid.");
        } else if (temperature < 75 && humidity > 65) {
            System.out.println("It's not too hot and humid.");
        } else if (temperature < 75 && humidity < 65) {
            System.out.println("It's not too hot and not humid.");
        } else {
            System.out.println("Not sure what to do.");
         }

        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch
        if (age > 21 && income > 50000) {
            System.out.println("You are eligible for a credit card.");
        } else {
            System.out.println("You are not eligible for a credit card.");
        }

        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green, yellow, red)
        // Decide whether to use if-else or switch
        switch (lightColor) {
            case "green":
                System.out.println("Go ahead.");
                break;
            case "yellow":
                System.out.println("Slow down.");
                break;
            case "red":
                System.out.println("Stop.");
                break;
            default:
                System.out.println("Not sure what to do.");
        }

        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge, or Opera
        // Decide whether to use if-else or switch
       switch (browser) {
        case "Chrome":
           System.out.println("Chrome is the best browser."); 
            break;
        case "Firefox":
            System.out.println("Firefox is the best browser.");
            break;
        case "Safari":
            System.out.println("Safari is the best browser.");
            break;
        case "Edge":
            System.out.println("Edge is the best browser.");
            break;
        case "Opera":
            System.out.println("Opera is the best browser.");
            break;
        default:
            System.out.println("Not sure what browser you are.");
            break;
       } 
    }
}