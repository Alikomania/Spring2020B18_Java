package day08_IfStatements;

public class EqualNumber_MultiBranchIf {

    /*
      WarmUp Task_1.
      Write a program that can check the equality of the
       three given numbers. Declares 3 numbers n1, n2, n3
           if n1 and n2 are equal ==> n1 & n2 are equal
           if n2 and n3 are equal ==> n2 & n3 are equal
           if n3 and n1 are equal ==> n3 & n1 are equal
           if all equal ==> all equal
           if none of them are equal ==> none of them are equal
          */

    public static void main(String[] args) {

        double n1 = 100.5;
        double n2 = 302.5;
        double n3 = 108.5;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n1Equaln3 = n3 == n1 && n3 != n2;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean allEqual = n1 == n2 && n2 == n3;

        String result = " ";

        if(n1Equaln2){
           // System.out.println("n1 is equal to n2");
            result = "n1 is equal to n2";
        } else if(n1Equaln3){
           // System.out.println("n1 is equal to n3");
            result = "n1 is equal to n3";
        } else if(n2Equaln3){
           // System.out.println("n2 is equal to n3");
            result = "n2 is equal to n3";
        } else if(allEqual) {
          //  System.out.println("all equal");
            result = "all equal";
        } else {
          //  System.out.println("none of them are equal");
            result = "none of them are equal";
        }
        System.out.println(result);


    }
}
