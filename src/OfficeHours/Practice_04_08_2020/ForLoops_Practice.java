package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {
    public static void main(String[] args) {

/*
    for(initialization; condition; iterator ){
            statements;
    }

    iterator: co-related to your condition

    execution order:
        1. initialization
        2. condition
            if true:
                statements in the body
               then iterator
            if false:
                stops loop
 */
        for(int i = 1; i <= 5; i += 2 ){// i++: 1, 2, 3, 4, 5
                                        // i+=2: 1, 3, 5
            System.out.println("Hello World"+i);
        }
        System.out.println("=========================================");

        for(int i = 1; i <= 5;){

            i++;
            System.out.println(i); //if iterator before statements, then print starts 2; not 1 => 2, 3, 4, 5
            i++; // if iterator after statements starts 1 (initial num); => 1, 2, 3, 4, 5
        }



    }
}
