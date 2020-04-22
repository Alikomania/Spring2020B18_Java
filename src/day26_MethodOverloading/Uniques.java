package day26_MethodOverloading;

public class Uniques { //// LOOK AT day19 Array uniques ////

    public static void main(String[] args) {
        String str = "ABBCDB";
        String result = "";// A

       for (int i = 0; i < str.length(); i++){
           int num = frequency(str, str.charAt(i)); //
           if (num == 1){
               result += str.charAt(i);
           }
       }
        System.out.println(result);

       String str2 = "Cybertek";
       String result2 = uniques(str2);
        System.out.println(result2);


    }

    /*
    2. use the above method to create another called uniques
    that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
     */

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
}
