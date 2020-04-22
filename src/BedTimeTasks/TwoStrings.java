package BedTimeTasks;

public class TwoStrings {
    public static void main(String[] args) {

/*
1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods
 */

    String str1 = "aabbbc";
    String str2 = "cab";

    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    boolean b = true;

    for(char each : arr1){
        if(!str2.contains(""+each)){
            b = false;
            continue;
        }
    }
    for (char each : arr2){
        if (!str1.contains(""+each)){
            b = false;
            break;
        }
    }
        System.out.println(b);



    }
}
