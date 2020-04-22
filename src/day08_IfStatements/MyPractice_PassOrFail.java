package day08_IfStatements;

public class MyPractice_PassOrFail {
    public static void main(String[] args) {

        byte mark = 10;
    String result = " ";

        if(mark < 60 && mark >= 0){
            result = "Fail";
        } else if(mark >= 60 && mark < 90){
            result = "Pass";
        } else if(mark > 90 && mark <= 100){
            result = "Passed with Distinction";
        }
        System.out.println(result);


    }
}
