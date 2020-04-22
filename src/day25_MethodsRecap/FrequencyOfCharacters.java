package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {

    public static void main(String[] args) { // LOOK AT DAY 19

        String str = "AABBCC"; // A2B2C2
                               // ABC (without numbers)

        String nonDup = Library.RemoveDuplicates(str); // ABC

        String result = "";

        for (int i = 0; i < nonDup.length(); i++){

            String ch = ""+nonDup.charAt(i); // 'A' => "A"(String)
            int num = Library.Frequency(str, ch);
          //  System.out.print(ch+num);
            result += ch+num;
        }
        System.out.println(result);




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


}
