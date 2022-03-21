package homeworkweek7;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
 */

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Programme5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input the employee id
        System.out.println("Input Employee ID");
        int id = obj.nextInt();

        // Input the Emplyee name
        System.out.println("Input Emplyee name");
        String name = obj.next();

        // In put Basic salary
        System.out.println("Input Basic salary");
        double basicSalary = obj.nextDouble();

        //HRA = Basic Salary 10%
        double HRA = basicSalary * 0.1;

        //DA = Basic salary 8%
        double DA = basicSalary * 0.08;

        // TA = Basic Salary 9%
        double TA = basicSalary * 0.09;

        // PF = Basic salary 20%
        double PF = basicSalary * 0.20;

        // Gross Salary = basic  + HR + TA+ DA - PF
        double GrossSalary = basicSalary + HRA + TA + DA - PF;

        System.out.println("|---------------------------------------|");
        System.out.println("|             Salary Slip               |");
        System.out.println("|_______________________________________|");
        System.out.println("| Employee Id         : " + id+"             |");
        System.out.println("| Emplyee Name        : " + name+"              |");
        System.out.println("|_______________________________________|");
        System.out.println("| Basic Salary        : " + basicSalary+"         |");
        System.out.println("| HRA 10%             : " + HRA+"          |");
        System.out.println("| TA 8%               : " + TA +"          |");
        System.out.println("| DA 9%               : " + DA +"          |");
        System.out.println("| PF 20%              : " + PF +"          |");
        System.out.println("|_______________________________________|");
        System.out.println("| Gross Salary        : " + GrossSalary+"         |");
        System.out.println("|=======================================|");
    }

}
