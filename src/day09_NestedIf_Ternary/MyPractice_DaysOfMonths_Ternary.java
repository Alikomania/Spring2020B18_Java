package day09_NestedIf_Ternary;

public class MyPractice_DaysOfMonths_Ternary {
    public static void main(String[] args) {

        byte month = 10;
        String result = " ";
        if(month >= 1 && month < 12) {
            result = (month == 2)? "28" :
                    (month == 4 || month == 6 || month == 9 || month == 9)?
                            "30" : "31";

        }
        System.out.println(result);




    }
}
