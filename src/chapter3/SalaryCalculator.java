package chapter3;

import java.util.Scanner;

/*
IF statement

salary 1000
bonus 250 for exceed 10 sales

 */
public class SalaryCalculator {

    public static void main (String args[]){
        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee'salay is $" + salary);
    }


}
