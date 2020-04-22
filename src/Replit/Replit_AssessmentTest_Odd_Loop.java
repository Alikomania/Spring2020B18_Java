package Replit;
/*
Write a  for loop that prints the odd integers 11 through 121 inclusive,
separated by spaces.
 */


public class Replit_AssessmentTest_Odd_Loop {
    public static void main(String[] args) {

        for(int i = 11; i <= 121; i +=2){
            if(i % 2 != 0){
                System.out.print(i+" ");
            }
        }




    }
}
