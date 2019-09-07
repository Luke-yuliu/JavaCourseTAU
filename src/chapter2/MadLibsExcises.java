package chapter2;

import java.util.Scanner;

public class MadLibsExcises {
    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a season");
        String season = scanner.next();

        System.out.println("enter a whole number");
        int wholeNumber = scanner.nextInt();

        System.out.println("enter an adjective");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season + " day, i drink a minimum of " + wholeNumber + " cups of coffee.");
    }


}

