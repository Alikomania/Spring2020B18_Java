package day44_Exceptions;

import java.util.Arrays;
import java.util.ArrayList;

public class try_catchBlocks {


    public static void main(String[] args) {

        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));



        try {
            System.out.println(list.get(10));
        } catch (IndexOutOfBoundsException e){
        // MUST be ExceptionClass or Parents Class (Exception / RuntimeException)


            System.out.println("Something went wrong");
        }


        System.out.println("Test started");

    }



}
