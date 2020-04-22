package OfficeHours.Practice_03_11_2020;

public class LiraToUSD {

    /*

    task 05:
        create a class called LiraToUSD,
        and write a program that can convert lira to dollars,
        and print the result
        Ex:
            if Lira = 1000;
            output:
            1000 Liras is equal to 160.97 USD
            if Lira = 1000000;
            output:
            1000000 is equal to 160969.70 USQ
     */

    public static void main(String[] args) {

        double LiraToUSDRate = 0.16097;
        int Lira = 1000;
        double LiraToUSD = LiraToUSDRate * Lira;

        System.out.println(Lira+" Liras is equal to "+LiraToUSD+" USD");

    }
}
