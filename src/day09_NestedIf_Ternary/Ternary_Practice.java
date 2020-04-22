package day09_NestedIf_Ternary;

public class Ternary_Practice {
    public static void main(String[] args) {
        int number = 0;
        char ch1 = ' ';

        if(number > 0){
            ch1 = '+';
        } else if( number < 0){
            ch1 = '-';
        } else {
            ch1 = '0';
        }

        char ch2 = (number > 0) ? '+' : (number < 0) ? '-' : '0';
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println("===============================");

        byte score = 0;
        String grade = " ";

        String grade2 = (score >= 90 && score <= 100)? "Excellent" :
                (score >= 80 && score < 90) ? "Great" :
                        (score >= 70 && score < 80) ? "Good" :
                                (score >= 60 && score < 70) ? "Pass" :
                                        (score < 60 && score >= 0)? "Failed" :
                                                "Invalid";
        System.out.println(grade2);
        System.out.println("=================================");

        int num = 1000;
        String result = " ";

        String result1 = (num % 2 == 0)? "Even" : "Odd";
        System.out.println(result1);




    }
}
