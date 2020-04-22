package day21_MultiDimensionalArrays;
/*
2. write a program that can return the logest string of text from an array

3. write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {

        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int maxLength = names[0].length(); // 4\
        int minLength = names[0].length();
        String longestWord = "";
        String shortestWord = "";

        for(int i = 1; i < names.length; i++){

            if(names[i].length() > maxLength){
                maxLength = names[i].length();
                longestWord = names[i];
            }
            if(names[i].length() < minLength ){
                minLength = names[i].length();
                shortestWord = names[i];
            }
        }
        System.out.println(longestWord);
        System.out.println(shortestWord);



    }
}
