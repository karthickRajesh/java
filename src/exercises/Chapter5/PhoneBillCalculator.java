package exercises.Chapter5;

import java.util.Scanner;

/*
 allow the user to input the plan fee and the number of overage minutes.
 you're going to charge 25 cents for every minute
 then a 15% tax on the subtotal.
 */
public class PhoneBillCalculator {

    public static void main(String[] args) {

        System.out.println("Enter The Plan Fee");
        Scanner scanner = new Scanner(System.in);
        double planfee = scanner.nextDouble();

        System.out.println("Enter the Overage minutes");
        int overage = scanner.nextInt();
        scanner.close();

        double overageCharges = calculateOvergae(overage);
        double tax = calculateTax(planfee + overageCharges);
        double finalCharges = planfee + overageCharges + tax;

        printAllvalues(planfee, overageCharges, tax, finalCharges);

    }
    public static double calculateOvergae(int overage){
        double rate = 0.25;
        return  overage * rate;
    }
    public static double calculateTax(double overage){
        double taxRate = 0.15;
        return  overage * taxRate;
    }
    public static void printAllvalues(double planfee, double overageCharges, double tax, double finalCharges){

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + planfee);
        System.out.println("Overage: " + overageCharges);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + finalCharges);
    }

}
