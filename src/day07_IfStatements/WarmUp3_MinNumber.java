package day07_IfStatements;

public class WarmUp3_MinNumber {
    public static void main(String[] args) {
        /*
        3. write a java program that accepts three numbers
        and return the minimum number
				(assume that none of them are equal)
         */

    double a = 300;
    double b = 200;
    double c = 400;

    boolean aminNum = a < b && a < c;
    boolean bminNum = b < a && b < c;
    boolean cminNum = c < b && c < a;

    if(aminNum){
        System.out.println(a+" is the minimum number");
    }
    if(bminNum){
        System.out.println(b+" is the minimum number");
    }
    if(cminNum){
        System.out.println(c+" is the minimum number");
    }


    }
}
