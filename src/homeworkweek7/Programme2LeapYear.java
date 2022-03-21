package homeworkweek7;
/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */

 import java.util.Scanner;
public class Programme2LeapYear {
    public static void main(String[] args){
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}




