package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        boolean USCitizen = true;
        byte age = 18;
        String result = " ";

        if(USCitizen){

            if(age >= 18){
                result = "You are eligible to vote";
            } else {
                result = "You are not eligible to vote";
            }
         } else {
            result = "Only US citizens are eligible to vote";
        }
        System.out.println(result);
        System.out.println("==================================");

        int score = 76;
        String grade = " ";

        if(score >= 0 && score <= 100){
            if(score >= 90){
                grade = "A";
            } else if(score >= 80){
                grade = "B";
            } else if(score >= 70){
                grade = "C";
            } else if(score >= 60){
                grade = "D";
            } else if(score < 60){
                grade = "F";
            }

        } else {
            grade = "Invalid";
        }
        System.out.println(grade);
        System.out.println("=============================");

        int score2 = 40;
        String grade2 = " ";

        if(score2 >= 0 && score2 <= 100){

            grade2 = (score2 >= 90)? "A" : (score2 >= 80)? "B" :
                    (score2 >= 70)? "C" : (score2 >= 60)? "D" :
                            (score2 < 60)? "F" : "Invalid";

        }
        System.out.println(grade2);

        // else {
         //   grade2 = "Invalid";
        // }




    }
}
