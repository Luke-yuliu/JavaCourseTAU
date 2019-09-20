package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        //initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("how many hours did you work this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("invalid entry. you hours msut be between 1 and 40. try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //calculate gross
        double gross = rate * hoursWorked;
        System.out.println("gross pay: $" + gross);
    }
}
