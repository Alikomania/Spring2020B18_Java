package day54_Maps;

import java.util.LinkedHashMap;

public class StudentGrade {

    public static void main(String[] args) {

        /*
        create a map that contains student names and Score
                                        String    Integer
                                    put 5 students names and thier scores
            write a program that can print out the names of the students who scored less than 90
         */
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();
        students.put("Zarina", 71);
        students.put("Mahmut", 75);
        students.put("Bakhodir", 66);
        students.put("Namik", 91);
        students.put("Emrah", 77);

        for (String eachStudent : students.keySet()){
            if (students.get(eachStudent) < 90)
            System.out.println(eachStudent +" "+ students.get(eachStudent));
        }



    }
}
