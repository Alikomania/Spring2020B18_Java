package Replit;
import java.util.Scanner;
public class newest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        int day = 0;

        for(int i = inhabitants; i > 0 ; i--){
            System.out.println("Day "+ day +" "+"["+inhabitants+"]");
            inhabitants = inhabitants / 2;
            day++;
            if(inhabitants <= 0){
                break;
            }
        }

        System.out.println("---- EXTINCT ----");


    }
}
