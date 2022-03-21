package homeworkweek7;

/*  Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
*/
import java.util.Scanner;

public class Programme01OddEven {

    public static boolean oddOrEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number ");

        int num = obj.nextInt();

        System.out.println(oddOrEven(num));

//        if (num % 5 == 0) {
//            System.out.println(num + " is even");
//        } else {
//            System.out.println(num + " is odd");
//        }
//        num % 5 == 0 ? System.out.println() : System.out.println();


    }


}
