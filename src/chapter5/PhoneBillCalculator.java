package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter your plan fee");
        double planFee = scanner.nextDouble();

        double overageCharge = overageMinutesFee();
        scanner.close();

        double tax = calculateTax(planFee + overageCharge);
        calculateAndPrintBill(planFee, overageCharge, tax);
    }

    public static double overageMinutesFee(){
        System.out.println("Enter your overage minutes");
        return scanner.nextInt() * 0.25;
    }

    public static double calculateTax(double subTotal){
        double rate = 0.15;
        return subTotal * rate;
    }

    public static void calculateAndPrintBill(double planFee, double overageCharge, double tax){
        double total = planFee + overageCharge + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f", overageCharge));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
