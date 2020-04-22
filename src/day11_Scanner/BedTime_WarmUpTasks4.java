package day11_Scanner;


import java.util.Scanner;

public class BedTime_WarmUpTasks4 {
    public static void main(String[] args) {
/*

	4. Revenue can be calculated as the
	selling price of the product times
	the quantity sold, i.e. revenue = price × quantity. 
	Write a program that asks the user
	to enter product price and quantity
	and then calculate the revenue.
	If the revenue is more than 5000
	a discount is 10% offered.
	Program should display the discount and net revenue.

 */
        Scanner rev = new Scanner(System.in);
        System.out.println("Enter product price");
        double productPrice = rev.nextDouble();
        System.out.println("Enter quantity");
        int quantity = rev.nextInt();
        double revenue = productPrice * quantity;
        double discount = revenue/10;
        double netRevenue = revenue - discount;

        if(revenue > 5000){
            System.out.println("Your discount is: $"+discount);
            System.out.println("Your net revenue is: $"+netRevenue);
        } else {
            System.out.println("Your revenue is: $"+revenue);
        }







    }
}
