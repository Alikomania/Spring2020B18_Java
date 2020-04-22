package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {

        /*
        odd number between 1 ~ 100 in a single line
        seperated by a space
         */

        String resultOdd = " ";
        for(int i = 1; i <= 100; i += 2){
          //  System.out.print(i+" ");
            resultOdd += i+" "; // resultOdd = resultOdd + number+" ";
        }
        System.out.println(resultOdd);

        String resultEven = " ";
        for(int num = 2; num <= 100; num += 2){
            resultEven += num+" ";
        }
        System.out.println(resultEven);



    }
}
