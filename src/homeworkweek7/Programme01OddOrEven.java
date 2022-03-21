package homeworkweek7;

import java.util.Scanner;

public class Programme01OddOrEven {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Pleae enter a number");
        int number =  sc.nextInt();
        // java odd or evern
        String strOutput = (number % 2 ==0)?"Even":"odd";
        System.out.println(number+ " is " + strOutput );
        sc.close();
    }

}


