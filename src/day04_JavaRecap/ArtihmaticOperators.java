package day04_JavaRecap;

public class ArtihmaticOperators {
    public static void main(String[] args) {

        boolean evenNumber = 25 % 2 == 0;

        System.out.println(evenNumber);

        boolean oddNumber = 22 % 2 != 0;
        System.out.println(oddNumber);

        System.out.println("25 is even number: "+ (25 % 2 == 0 ));
        System.out.println("25 is even number: "+ !(25 % 2 != 0 ));


    }


}
