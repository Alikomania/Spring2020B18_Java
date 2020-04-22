package day19_Arrays;
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] students = new String[10];

        System.out.println("Enter 10 student name : ");

        for (int i = 0; i <= students.length-1; i++) {
            System.out.print((i+1) +". student name: ");
            students[i] = input.nextLine();
        }
        System.out.println("Name list of students: ");

        for (int i = 0; i <=students.length-1 ; i++) {
            String name = students[i];
            System.out.println(name);
        }



    }
}
