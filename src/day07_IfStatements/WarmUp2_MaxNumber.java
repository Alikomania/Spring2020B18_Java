package day07_IfStatements;

public class WarmUp2_MaxNumber {
    public static void main(String[] args) {
        /*
        2. write a java program that accepts three numbers
        and return the maximum number
				(assume that none of them are equal)
         */
        double a = 500;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c; // && : BOTH :at the same time
        boolean bGreater = b > a && b > c; // || : OR : either one
        boolean cGreater = c > b && c > a;

        if(aGreater){
            System.out.println(a+" is greater number");
        }
        if(bGreater){
            System.out.println(b+" is greater number");
        }
        if(cGreater){
            System.out.println(c+" is greater number");
        }

    }
}
