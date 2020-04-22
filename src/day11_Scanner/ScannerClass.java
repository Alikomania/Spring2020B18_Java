package day11_Scanner;


import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a long number");
        long a = input.nextLong();
        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal: ");
        long b = (long) input.nextFloat();
        System.out.println("You have entered: "+b);

        System.out.println("Enter a decimal number: ");
        double f = input.nextDouble();
        System.out.println("You have entered: "+f);

        System.out.println("Enter true or false");
        boolean bool = input.nextBoolean();
        System.out.println(bool);

        System.out.println("Enter your sentence: ");
        String word = input.next();
        System.out.println("You have entered: "+word);





    }




}
