package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String args[]){

        //initialize
        int aDollar = 100;
        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;

        //how much you got
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        penny = quantity * penny;

        System.out.println("How many nickels would you like?");
        quantity = scanner.nextInt();
        nickel = quantity * nickel;

        System.out.println("How many dime would you like?");
        quantity = scanner.nextInt();
        dime = quantity * dime;

        System.out.println("How many quarter would you like?");
        quantity = scanner.nextInt();
        quarter = quantity * quarter;

        scanner.close();

        //calculation
        int changes = aDollar - (penny + nickel + dime + quarter);


        //decide if it's a win

        if (changes == 0){
            System.out.println("Awesome, you've won a dollar");
        }
        else if(changes > 0){
            System.out.println("Good try, you are " + changes + " cents short.");
        }
        else {
            System.out.println("Good try, you are " + Math.abs(changes) + " cents over.");
        }

    }
}
