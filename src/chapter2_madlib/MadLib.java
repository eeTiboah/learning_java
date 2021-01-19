package chapter2_madlib;

import java.util.Scanner;

public class MadLib {
    public static void main(String arg[]){
        System.out.println("Enter season of year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter cups of coffee you drink");
        int cup = scanner.nextInt();

        System.out.println("Enter adjective");
        String adj = scanner.next();
        scanner.close();

        System.out.println("On a " + adj + " " + season + " day, I drink a minimum of " + cup + " cups of coffee");
    }
}
