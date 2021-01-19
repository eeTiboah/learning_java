package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int cent = 100;
        System.out.println("How many pennies you like? ");
        int pennies = scanner.nextInt();
        System.out.println("How many nickels you like? ");
        int nickels = scanner.nextInt() * 5;
        System.out.println("How many dimes you like? ");
        int dimes = scanner.nextInt() * 10;
        System.out.println("And how many quarters you like? ");
        int quarters = scanner.nextInt() * 25;

        scanner.close();
        double total = pennies + nickels + dimes + quarters;
        int dollar = 1;
        double dollarDiv = total/cent;
        double difference;

        if (total > cent){
            difference = dollarDiv - dollar;
            System.out.println("You got $" + dollarDiv + " which is more than $" + dollar + " by " + String.format("%.2f", difference));
        }
        else if (total < cent){
            difference = dollarDiv - dollar;
            System.out.println("You got $" + dollarDiv + " which is more than $" + dollar + " by " + String.format("%.2f", difference));
        }
        else{
            System.out.println("You got $" + dollar + ". You win!!");
        }


    }
}
