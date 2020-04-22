package day19_Arrays;

public class Frequency {
    public static void main(String[] args) {

/*
2. write a program that can return the frequency
of the characters in a string

		Ex: "AABCBCA" ==> "A3B2C2"
	Hint: You need nested loops
 */

    String str = "AABCCAA"; // A2B1C2

    String result = ""; // A2B1C2

        String nonDup = ""; // ABC

        for(int i = 0; i <= str.length()-1; i++){ // if the character at index i is not
                                                // contained then it will be concated.
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup += str.charAt(i);
            }

        }

       // System.out.println(nonDup);

        // nonDup = "ABC; str = "AABCC; ==> result = "A2B1C2


        for(int j = 0; j <= nonDup.length()-1; j++){
            char ch = nonDup.charAt(j);

            int count = 0; // count the total number of
            // occurance of each character from str
            for(int i= 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count++;
                }

            }
            result += ""+ ch + count;

        }


        System.out.println(result);








    }
}
