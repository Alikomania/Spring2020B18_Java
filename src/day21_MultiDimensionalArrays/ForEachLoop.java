package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        /*
        for(DataType variableName : ArrayName ){

            }
         */
        int[] nums = {1, 2, 3, 4};

        for(int eachElement : nums){ // no index, no iterator

            System.out.println(eachElement);
        }

        String[] students = {"Muhtar", "Asiya", "Murodil"};

        for(String eachStudents : students){ // DataType MUST BE MATCHED with Array's dataType
                                            // (if int => int; if String => String
            System.out.println(eachStudents);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int each : arr1){
            if(each >= 5){
                System.out.println(each);
            }
        }
        int[] arr2 = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 1};

        for(int each : arr2){

            if(each < 5){
                continue;
            }

            System.out.println(each);
        }
        System.out.println("=======================================");

        String sentence = "I like Java"; // Java like I

        String[] words = sentence.split(" "); // {I, like, Java}


        for (String eachWord : words){
            System.out.println(eachWord); // I like Java
        }
        System.out.println("================================");

        for(int i = words.length-1; i >= 0; i--){
            System.out.println(words[i]); // Java like I
        }




    }
}
