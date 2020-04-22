package day08_IfStatements;

public class MyPractice_Average {
    public static void main(String[] args) {

        byte average = 60;
        String grade = " ";

        if(average >= 90 && average <= 100){
            grade = "A";
        } else if(average >= 80 && average <= 89){
            grade = "B";
        } else if(average >= 70 && average <= 79){
            grade = "C";
        } else if(average >= 60 && average <= 69){
            grade = "D";
        } else if(average >= 0 && average <= 59){
            grade = "F";
        }
        System.out.println(grade);


    }
}
