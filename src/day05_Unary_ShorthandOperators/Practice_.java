package day05_Unary_ShorthandOperators;

public class Practice_ {

    public static void main(String[] args) {


       /* number = 65;  ==> int
        divisibleBy2 ==> true/false
        divisibleBy3 ==> true/false
        divisbileBy5 ==> true/false

        output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
*/
       short number = 80;

       boolean divisibleBy2 = number % 2 == 0;
       boolean divisibleBy3 = number % 3 == 0;
       boolean divisibleBy5 = number % 5 == 0;

       String d2 = " is divisible by 2: ";
       String d3 = " is divisible by 3: ";
       String d5 = " is divisible by 5: ";

       String result2 = number+d2+divisibleBy2;
       String result3 = number+d3+divisibleBy3;
       String result5 = number+d5+divisibleBy5;

        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result5);


    }

}
