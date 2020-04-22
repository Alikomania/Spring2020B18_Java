package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

     //   int scores = 90; // regular variables can only have one data (90)

        /*
        decleration:
        DataType[ ]   variableName = {data1, data2, data3... };

         */


     // int scores[] = {90, 80, 70 }; the bracket [] can be after variable or after the dataType. doesn't matter
        int[] scores = {7, 75, 85, 90, 95, 100 };
            //          0, 1,  2,  3,  4,   5

    // retrive data from the array: variableName[index]

        int num1 = scores[2]; // 85, int

        System.out.println(num1);

        int num2 = scores[5]; // 100, int

        System.out.println(num2);


    }
}
