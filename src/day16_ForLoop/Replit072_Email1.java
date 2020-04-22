package day16_ForLoop;
import java.util.Scanner;
public class Replit072_Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();

        String s1 = "";
        int first = email.indexOf("_");
        int last = email.indexOf("@");
        if (email.contains("_")) {
            s1 = s1 + email.substring(first + 1, last) + email.substring(first, first + 1) + email.substring(0, first);
            System.out.println("" + s1 + "@gmail.com");
        } else {
            System.out.println(email);
        }
    }
}
