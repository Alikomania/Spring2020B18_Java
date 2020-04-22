package day07_IfStatements;

public class WarmUp4_MediumNumber {
    public static void main(String[] args) {
        /*
        write a java program that accepts three numbers
        and return the medium number
				(assume that none of them are equal)
         */

        double a = 600;
        double b = 900;
        double c = 500;

        boolean aMediumNum = (a < b && a > c) || (a > b && a < c);
        boolean bMediumNum = (b < c && b > a) || (b > c && b < a);
        boolean cMediumNum = (c < b && c > a) || (c > b && c < a);

        if(aMediumNum){
            System.out.println(a+" is the medium number");
        }
        if(bMediumNum){
            System.out.println(b+" is the medium number");
    }
        if(cMediumNum){
            System.out.println(c+" is the medium number");

        }
}
}
