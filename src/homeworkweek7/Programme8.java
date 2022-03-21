package homeworkweek7;

import java.util.Scanner;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {
        char ch;
        Scanner scr = new Scanner(System.in);
        System.out.println("Please Enter the alphabet between A to F : ");
        ch = scr.next().charAt(0);

        switch (ch) {
            case 'A':
                System.out.println("A = Ahmedabad");
                break;
            case 'B':
                System.out.println("B = Baroda");
                break;
            case 'C':
                System.out.println("C = Chandigarh ");
                break;
            case 'D':
                System.out.println("D = Dehradun");
                break;
            case 'E':
                System.out.println("E = Edar");
                break;
            case 'F':
                System.out.println("F = Firozpur");
                break;
            default:
                System.out.println("Invalid Alphabet");
        }

    }
}