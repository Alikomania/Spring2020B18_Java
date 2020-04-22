package day18_nestedLoops;

import java.util.Scanner;
/*
    Assignment;
    write a program for the room reservation:
    King bed => 120$
    Queen bed => 100$
    Single bed => 80$

        should ask which bedroom do you wanna reserve?
            if user provided invalid entry => please re-enter

            calculate the total price

       do you want to reserve another room:
            if yes => repeat the previous steps
            if no => your total price is: $$$

            if answer either yes or no => please re-enter

     */
public class RoomReservation {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        int totalNight = 0;
        int totalPrice = 0;
        int roomPrice = 0;


        while (true) {
            System.out.println("which bedroom do you wanna reserve?");
            String room = s.nextLine();

            while ( ! (room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") || room.equalsIgnoreCase("single bed") ) ){
                System.out.println("Invalid entry, please re-enter");
                room = s.nextLine();

            }

            if(room.equalsIgnoreCase("king bed")){
                roomPrice = kingBed;
            } else if(room.equalsIgnoreCase("queen bed")){
                roomPrice = queenBed;
            } else if(room.equalsIgnoreCase("single bed")){
                roomPrice = singleBed;
            }

            System.out.println("How many nights?");
            totalNight = s.nextInt();
            totalPrice += totalNight * roomPrice;

            s.nextLine();
            System.out.println("Do you want to another room");
            String anotherRoom = s.nextLine();

            while (!(anotherRoom.equalsIgnoreCase("yes") || anotherRoom.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter, yes or no");
                anotherRoom = s.next();
            }
            if(anotherRoom.equalsIgnoreCase("no")){
                System.out.println("Total price is: $"+totalPrice);
                break;

            }


        }



    }
}

