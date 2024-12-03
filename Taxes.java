// Taxes.java
// Kameron Ibraheem
// Lab02: Taxes
// 
//
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        System.out.print("Single or Married? (Please Enter S or M): ");
        String choice = scrn.nextLine();

        System.out.print("Enter Annual Income :$");
        int income = scrn.nextInt();

        if (choice.equals("S")) {
            if (income <= 25000) {
                double tax = income * 0.055;
				System.out.println("Status: Single");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$" + tax);
            } else if (income <= 83000) {
                double tax = income * 0.07;
				System.out.println("Status: Single");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$" + tax);
            } else if (income <= 157000) {
                double tax = income * 0.075;
				System.out.println("Status: Single");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$" + tax);
            } else {
				double tax = income * .10;
				System.out.println("Status: Single");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$ + tax");
            }
			
			
        } else if (choice.equals("M")) {
            if (income <= 37000) {
                double tax = income * 0.055;
				System.out.println("Status: Married");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$" + tax);
            } else if (income <= 14700) {
                double tax = income * 0.07;
				System.out.println("Status: Married");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$" + tax);
            } else if (income <= 260000) {
                double tax = income * 0.075;
				System.out.println("Status: Married");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$" + tax);
            } else {
				double tax = income * .10;
				System.out.println("Status: Married");
				System.out.println("Annual Income:$" + income);
                System.out.println("Amount of tax due:$ + tax");
            }
        } else {
            System.out.println("Error: Please use required formatting.");
        }
    }
}
