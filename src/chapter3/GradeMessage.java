package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String args[]){
        System.out.println("enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "great";
                break;
            case "C":
                message = "good";
                break;
            case "D":
                message = "work harder";
                break;
            case "F":
                message = "un oh!";
                break;
            default:
                message = "error.invalid grade";
                break;
        }
        System.out.println(message);
    }
}
