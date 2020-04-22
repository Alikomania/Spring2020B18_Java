package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        System.out.println(arr.length); // 3

        int[] arr2 = new int[5];

        System.out.println(arr2[0]); // 0
        System.out.println(arr2[1]); // 0


        String[] Testers = new String[3]; // {"Reem", "Madina", "Osman"};
        // index: 0, 1, 2
        Testers[0] = "Reem";
        Testers[2] = "Osman";
        Testers[1] = "Madina";

        System.out.println(Testers[0]); // Reem
        System.out.println(Testers[1]); // Madina
        System.out.println(Testers[2]); // Osman

        System.out.println(Testers.length); // 3
        System.out.println("====================================");

        String[] students = new String[10];
        // write a program that asks "enter a name" 10 times,
        // and store each of the names in the array students

        String result = "";

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < students.length-1; i++) {
            System.out.println("Enter a name");
            String name = s.nextLine();
            result += name+"\n";


        }
        System.out.println(result);


    }
}

