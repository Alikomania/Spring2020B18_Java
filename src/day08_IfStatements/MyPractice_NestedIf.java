package day08_IfStatements;

public class MyPractice_NestedIf {
    public static void main(String[] args) {

        double salary = 30000;
        byte yearsOnJob = 1;

        String result = " ";

        if(salary >= 30000){
            if(yearsOnJob >= 2){
                result = "You qualify for the loan";
            } else {
                result = "You must have been on your current" +
                        " job at least 2 years to qualify";
            }
        } else {
            result = "You must earn at least $30.000 per year";
        }
        System.out.println(result);


    }
}
