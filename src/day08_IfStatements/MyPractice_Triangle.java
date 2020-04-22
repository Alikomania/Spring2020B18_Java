package day08_IfStatements;

public class MyPractice_Triangle {
    public static void main(String[] args) {


        int angle1 = 80;
        int angle2 = 30;
        int angle3 = 90;
        boolean sumAngle = angle1+angle2+angle3 == 180;
    String result = " ";

        if(sumAngle == true){
            result = "This is triangle";
        } else {
            result = "This is not triangle";
        }
        System.out.println(result);


    }
}
