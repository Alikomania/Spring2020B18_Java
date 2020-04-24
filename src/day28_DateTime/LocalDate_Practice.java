package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    /*
    Warmup task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store their birthdays in the same order
	3. use for loop to print out your friends' names and their birthdays
     */
    public static void main(String[] args) {

        String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday = LocalDate.of(2010, 5, 6);

        LocalDate[] birthday = {JohnBirthday, AaronBirthday, DanielBirthday};

        for (int i = 0; i < friends.length; i++){
            String name = friends[i];
            LocalDate bd = birthday[i];
            System.out.println( name+"'s birthday is "+bd );
        }


        /*
        int a = 100;
        int b = 200;
        int c = 300;
        int[] array1 = {a, b, c};

         */




    }
}
