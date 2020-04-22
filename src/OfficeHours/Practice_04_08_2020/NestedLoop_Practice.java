package OfficeHours.Practice_04_08_2020;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        /*
            nested loop: loop inside another loop
                inner loop & outer loop


            nested loop: we only need them when we need to repeat a loop

            other loop repeats the inner loop
        */

        int j = 5;
        while (j < 10){
            for(int i = 10; i <= 50; i += 10){
                System.out.print(i+" ");
            }
            System.out.println();

            j++;
        }
        System.out.println("=============================================]");

    /*
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
     */

    int t = 0;
    while (t < 8){
        for(int k = 0; k <= 5; k++){
            System.out.print("* ");
        }
        System.out.println();

        t++;
    }
        System.out.println("=======================================");

    /*

    *
    * *
    * * *
    * * * *
    * * * * *
    * * * * * *
    * * * * * * *

  */

    for(int i = 1; i <= 7; i++){

        for(int k = 0; k < i; k++){
            System.out.print("* ");
        }
        System.out.println();

    }
        System.out.println("==================================");

        for(int i = 7; i >= 1; i--){

            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();

        }








    }
}
