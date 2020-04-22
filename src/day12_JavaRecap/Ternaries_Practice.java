package day12_JavaRecap;

import java.util.Scanner;

public class Ternaries_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter status code: ");
        int statusCode = scan.nextInt();

        String result = " ";

        if(statusCode == 200){
            result = "OK";
        } else if(statusCode == 201){
            result = "Created";
        } else if(statusCode == 202){
            result = "Accepted";
        } else {
            result = "Invalid";
        }
        System.out.println(result);

        String result2 = (statusCode == 200) ? "OK" :
                (statusCode == 201)? "Created":
                        (statusCode == 202)? "Accepted" :
                                "Invalid";
        System.out.println(result2);






    }
}
