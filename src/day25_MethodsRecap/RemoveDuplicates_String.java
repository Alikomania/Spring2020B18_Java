package day25_MethodsRecap;

public class RemoveDuplicates_String {
    public static void main(String[] args) {

        String str = "ABABABABABAB"; // look at => DAY17
        String result = "";     // for dubplicate => AB

        /*
        String ch = str.charAt(i) +""; // A
        if(!result.contains(ch)){
            result += ch;
        */

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (!result.contains(""+ch)){
                result += ch;
            }
        }
        System.out.println(result);

        String str2 = "ABCABCABC";
        String result2 = RemoveDuplicates(str2);
        System.out.println(result2);


    }

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


}
