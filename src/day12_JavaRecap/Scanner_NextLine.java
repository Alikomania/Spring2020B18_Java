package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter some number");
        int num = scan.nextInt(); // 13 + Enter (in the Scanner memory 13 + Enter)
        System.out.println(num);

        scan.nextLine(); // used for taking out the -that left on the Scanner- "Enter"

        System.out.println("Enter your name");
        String name = scan.nextLine(); // Enter

        System.out.println(name);



    }
}
