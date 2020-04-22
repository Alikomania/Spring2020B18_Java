package Replit;
import java.util.Scanner;
public class newRep {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kingbed = 120;
        int queenbed = 100;
        int singlebed = 80;
        int price = 0;

        while (true) {
            System.out.println("Which room do you want to reserve?");
            String room = input.nextLine();

            while (!(room.equalsIgnoreCase("King bed") || room.equalsIgnoreCase("Queen bed") || room.equalsIgnoreCase("Single bed"))) {
                System.out.println("Please re-enter");
                room = input.nextLine();
            }
            if (room.equalsIgnoreCase("King bed")) {
                price += kingbed;
            } else if (room.equalsIgnoreCase("Queen bed")) {
                price += queenbed;
            } else {
                price += singlebed;
            }

            System.out.println("Do you want to reserve another room? ");
            String answer = input.nextLine();
            while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
                System.out.println("Invalid entry, please re-enter");
                answer = input.nextLine();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Total price is: $" + price);
                break;
            }
        }

    }
}
