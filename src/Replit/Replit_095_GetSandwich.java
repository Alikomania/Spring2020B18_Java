package Replit;
import java.util.Scanner;
/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance
of "bread" in the given string, or return string "nothing"
if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */
public class Replit_095_GetSandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = str;
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str2.contains("bread")){
                str2.replaceFirst("bread", "");
                count++;
            }


        }
        if(str.length() <= 10 || count == 1){
            System.out.println("nothing");
        } else {
            System.out.println(str.substring(str.indexOf("bread")+5, str.lastIndexOf("bread")));
        }
/*
String str2 = str;
int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str2.contains("bread")){
                str2 = str2.replaceFirst("bread","");
                count++;
            }
        }
​
​
        if(str.length() <= 10 || count <= 1) {
            System.out.println("nothing");
​
        }
        else {
            System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
        }
 */


    }
}
