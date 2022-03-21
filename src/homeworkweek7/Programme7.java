package homeworkweek7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
import java.util.Scanner;

public class Programme7 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        // input Sales Id
        System.out.println("Input Sales Id: ");
        int Id = scr.nextInt();
        //input the seller's name
        System.out.println("Input Seller's name: ");
        String Name = scr.next();
        //Input basic salary
        System.out.println("Input basic Salary");
        double Salary = scr.nextDouble();
        //input sales amount
        System.out.println("Input sales amount: ");
        double Amount = scr.nextDouble();


        if (Amount >= 50000){
            System.out.println("Sales Commission is 35%");
        }
        else if (Amount >= 30000){
            System.out.println("Sales Commission is 20%");
        }
        else if (Amount >= 20000){
            System.out.println("Sales Commission is 10%");
        }
        else if (Amount >= 10000){
            System.out.println("Sales Commission is 5%");
        }
        else if (Amount < 10000){
            System.out.println("Sales Commission is 2%");
        }

    }
}