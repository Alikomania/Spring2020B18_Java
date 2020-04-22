package day08_IfStatements;

public class EqualNumbers {
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
       double n2 = 102.5;
       double n3 = 101.5;

       boolean n1Equaln2 = n1 == n2 && n1 != n3;
       boolean n2Equaln3 = n2 == n3 && n2 != n1;
       boolean n1Equaln3 = n3 == n1 && n3 != n2;
       boolean allEqual = n1 == n2 && n2 == n3;

       boolean nonOfThemEqual = n1 !=n2 && n2 != n3 && n1 !=n3;
    //    boolean nonEqual = n1Equaln2 == false && n2Equaln3 == false && n1Equaln3 == false;
    //    boolean nonEqual2 = !n1Equaln2 && !n2Equaln3 && !n1Equaln3;

    if(n1Equaln2){
        System.out.println("n1 is equal to n2");
    }
    if(n2Equaln3){
        System.out.println("n2 is equal to n3");
    }
    if(n1Equaln3){
        System.out.println("n1 is equal to n3");
    }
    if(allEqual){
        System.out.println("all equal");
    } else {
        System.out.println("none of them are equal");
    }

   }

    }

