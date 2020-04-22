package day08_IfStatements;

public class MultiBranchIf_Practice {
    /*
    The marks obtained by a student in 3 different
    subjects are input by the user. Your program
    should calculate the average of subjects.
    The student gets a grade as per the following rules:

AVERAGE GRADE 90-100 A
            80-89 B
            70-79 C
            60-69 D
            0-59 F
     */
    public static void main(String[] args) {

        double score = 89.5; // Assume that grade is 0 ~ 100

        boolean AGrade = score >= 90 && score <= 100;
        boolean BGrade = score >= 80 && score < 90;
        boolean CGrade = score >= 70 && score < 80;
        boolean DGrade = score >= 60 && score < 70;
        boolean FGrade = score >= 0 && score < 60;

    /*
        if(AGrade){
            System.out.println("A");
        } else if(BGrade){
            System.out.println("B");
        } else if(CGrade){
            System.out.println("C");
        } else if(DGrade){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
             */

        char grade = ' ';   // We can use String variable with " "
     // String grade = " "  // If we can also we should at if statements " "

        if(AGrade){
            grade = 'A'; // grade = "A" (If when we used String)
        } else if(BGrade){
            grade = 'B'; // grade = "B" (If when we used String)
        } else if(CGrade){
            grade = 'C'; // grade = "C" (If when we used String)
        } else if(DGrade){
            grade = 'D'; // grade = "D" (If when we used String)
        } else {
            grade = 'F'; // grade = "F" (If when we used String)
        }
        System.out.println("Score "+score+" is "+grade);



    }

}


