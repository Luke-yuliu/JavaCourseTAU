package chapter3;

import java.util.Scanner;
/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */



public class LoanQualifier {

    public static void main(String args[]){

        //initialize
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get user input
        System.out.println("enter you salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //decision
        if(salary >=requiredSalary){
            if (years >= requiredYearsEmployed){
                System.out.println("congratulations! you qualify for the loan!");
            }
            else{
                System.out.println("sorry, you must have worked at your current job "
                        + requiredYearsEmployed + "years.");
            }
        }
        else{
            System.out.println("sorry, you must earn at least $"
            + requiredSalary + " to qualify for the loan");
        }
   }

}
