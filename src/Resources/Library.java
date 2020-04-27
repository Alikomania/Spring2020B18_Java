package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    // remove duplicates from String

    // Frequency of String

    // Merge two array and return third one

    // Max number from array

    // min number from array

    public static String RemoveDuplicates(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }
        }
        return result;
    }

    public static int Frequency(String str1, String str2){

        int count = 0;
        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
        return count;
    }

    public static String FrequencyOfChars(String str){

        String nonDup = Library.RemoveDuplicates(str); // ABC
        String result = ""; // contains the frequency of chars

        for (int i = 0; i < nonDup.length(); i++){

            String ch = ""+nonDup.charAt(i); // 'A' => "A"(String)
            int num = Library.Frequency(str, ch);
            //  System.out.print(ch+num);
            result += ch+num;
        }

        return result;
    }

    public static int frequency(String str, char ch){// counts the one ch frequency
        char[] arr = str.toCharArray(); // [A,A,A]

        int count = 0;
        for ( char each : arr ){ // 3 times executed
            if (each == ch){
                count++;
            }
        }
        return count;

    }

    public static String uniques(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++){
            int num = frequency(str, str.charAt(i)); //
            if (num == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static int max(ArrayList<Integer> list){  // returns the mxmum number from arraylist
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){

            if(list.get(i) > maximum ){
                maximum = list.get(i);
            }

        }

        return maximum;
    }



}