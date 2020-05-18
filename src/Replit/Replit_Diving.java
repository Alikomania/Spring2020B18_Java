package Replit;
import java.util.*;
public class Replit_Diving {



        public static void main(String[] args) {
            //WRITE YOUR CODES HERE

            double total = 0;
            double diversRate = 0.6;

            Scanner scan = new Scanner(System.in);

            ArrayList<Integer> points = new ArrayList<>();

            for (int i = 1; i < 8; i++){
                System.out.println("Enter score for judge "+i+":");
                int score = scan.nextInt();
                points.add(score);
            }
            System.out.println("Enter difficulty: ");
            double difficulty = scan.nextDouble();

            Collections.sort(points);
            points.remove(0);
            points.remove(points.size()-1);

            for (Integer each : points){
                total += each;
            }
            total *= diversRate * difficulty;


            // FINAL OUTPUT
            System.out.printf("Total: %.2f", total);
        }
    }

/*
Scanner scan = new Scanner(System.in);

        ArrayList <Integer> scores = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {
            System.out.println("Enter score for judge "+i+":");
            int score = scan.nextInt();
            scores.add(score);
        }
        System.out.println("Enter difficulty:");
        double difficulty = scan.nextDouble();
        Collections.sort(scores);
        scores.remove(0);
        scores.remove(5);
        int sum = 0;
        for (Integer each : scores){
            sum += each;
        }
        double total = sum * difficulty * 0.6;
 */
