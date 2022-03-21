package homeworkweek7;
/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
Same as above program-8 using switch statement.
 */
import java.util.Locale;
import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Please Enter the alphabet between A TO F");
        String day = scr.next().toUpperCase();

        switch (day) {

            case "A":
                System.out.println("A = Ahmedabad ");
                break;

            case "B":
                System.out.println("B = Baroda");
                break;

            case "C":
                System.out.println("C =  Chandigarh ");
                break;

            case "D":
                System.out.println("D = Delhi ");
                break;

            case "E":
                System.out.println("E = Edar");
                break;

            case "F":
                System.out.println("F  = Faizabad");
                break;

            default:
                System.out.println("Invalid Character Value, Characters should be between A and F");
        }
    }


}