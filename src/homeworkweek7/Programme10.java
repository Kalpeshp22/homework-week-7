package homeworkweek7;
/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */
import java.util.Scanner;
public class Programme10 {

    public static void main(String[] args) {

        char ch;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the operator you want (+, -, *, /): ");
        ch = input.next().charAt(0);
        if (ch == '+'){

            System.out.println("\nAddition of " +num1+ " + " +num2+ " = " + (num1 + num2));
        }
        else if (ch == '-'){
            System.out.println("\nSubtraction of " +num1+ " - " +num2+ " = " + (num1 - num2));
        }
        else if (ch == '*'){
            System.out.println("\nMultiplication of " +num1+ " * " +num2+ " = " + (num1 * num2));
        }
        else if (ch == '/'){
            System.out.println("\nDivision of " +num1+ " / " +num2+ " = " + (num1 / num2));
        }
        else {
            System.out.println("Operator is not available");
        }
    }
}

