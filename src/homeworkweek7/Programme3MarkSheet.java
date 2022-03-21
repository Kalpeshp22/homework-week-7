package homeworkweek7;
/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Programme3MarkSheet {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        // Input the name of the student
        System.out.println("Input name");
        String name = ob.next();
        // Input the roll number of the student
        System.out.println("Input roll number");
        int roll = ob.nextInt();
        // Input the subject results
        // Maths
        System.out.println("Input Marks for Maths");
        double Maths = ob.nextDouble();
        // Error handling
        if (Maths > 100 || Maths < 0) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");
        }
        // Science
        System.out.println("Input Marks for Science");
        double Science = ob.nextDouble();
        // Error Handling
        if (Science > 100 || Science < 0) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");
        }
        // English
        System.out.println("Marks for English");
        double English = ob.nextDouble();
        // Error Handling
        if (English > 100 || English < 0) {
            System.out.println("Invalid Input, Marks should be between 0 and 100");
        }
        // total
        double total = Maths + Science + English;
        // percentage: average
        double percentage = total / 3;

        // Grading
        String Result = "0";
        if (percentage >= 35){
            Result = "pass";
        } else {
            Result = "fail";
        }

        // Grade
        String Grade = "0"; // intilize
        if (percentage >= 80) {
            // Value of grade should be A+ if percentage is over 80
            Grade = "A+";
        } else if (percentage >= 60){
            // Value of Grade should be A if percentage is over 60
            Grade = "A";
        } else if (percentage >= 50) {
            // Value of Grade should be A if percentage is over 50
            Grade = "B";
        } else if (percentage >= 35) {
            // Value of Grade should be C if percentage is over 35
            Grade = "C";
        }

        // Display the data
        System.out.println("|--------------------------------------|");
        System.out.println("|             Mark Sheet               |");
        System.out.println("|--------------------------------------|");
        System.out.println("| Name             :            Kalpesh|");
        System.out.println("| Roll Number:     08                  |");
        System.out.println("|                                      |");
        System.out.println("| Subjects         :              Marks|");
        System.out.println("|--------------------------------------|");
        System.out.println("|  Math            :              98   |");
        System.out.println("|  Science         90                  |" );
        System.out.println("|  English         85                  |");
        System.out.println("|--------------------------------------|");
        System.out.println("|  Total            :             273  |");
        System.out.println("|--------------------------------------| ");
        System.out.println("| Percentage:       :              91.0|");
        System.out.println("| Result            :              Pass|");
        System.out.println("| Grade             :               A+ |");
        System.out.println("|______________________________________|");

    }
}
