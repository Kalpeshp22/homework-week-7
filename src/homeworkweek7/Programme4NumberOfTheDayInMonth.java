package homeworkweek7;
/*
Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
 import java.util.Scanner;
public class Programme4NumberOfTheDayInMonth {
    public static void main(String[] args) {

        int year;// instance variable
        int month;// instance variable

        Scanner s = new Scanner(System.in);// created object for scanner class
        System.out.println("Enter Year: ");
        year = s.nextInt();//read user input
        System.out.println("Enter Month: ");// print statement
        month = s.nextInt();// read user input

        isLeapYear(year);
        getDaysInMonth(year, month);

    }

    public static boolean isLeapYear(int year) {//static method
        boolean result;// data types
        if (year >= 1 && year <= 9999) {// if-else condition
            System.out.println("This is a leap year");// print statement
            return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        } else {
            System.out.println("This is not a leap year");// print statement
            return false;
        }
    }

    public static int getDaysInMonth(int year, int month) {//static method
        if (month < 1 || month > 12) {// if- else condition
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {// statement syntax
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("This month has 31 days");//print statement
                    return 31;
                case 2: {
                    if (isLeapYear(year)) {//if-else condition
                        System.out.println("This month has 29 days");//print statement
                        return 29;
                    } else {
                        System.out.println("This month has 28 days");//print statement
                        return 28;
                    }
                }
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("This month has 30 days");//print statement
                    return 30;//rule

                default:
                    return -1;//rule
            }
        }
    }
}

