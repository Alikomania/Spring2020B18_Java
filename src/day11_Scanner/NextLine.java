package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // accepts the 'Enter'

        System.out.println("Enter the full name: ");
        String fulName = s.nextLine();

        System.out.println(fulName);

        System.out.println("Your full name is: "+fulName);
        System.out.println("Enter your sentence: ");
        String sentence = s.nextLine();

        System.out.println("You entered: "+sentence);

    }
}
