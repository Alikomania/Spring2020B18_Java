package day54_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Classmate {

    public static void main(String[] args) {

        Map<String, LocalDate> classMateBirthday = new LinkedHashMap<>();
        classMateBirthday.put("Zarina", LocalDate.of(1986, 01, 21));
        classMateBirthday.put("Bakhodir", LocalDate.of(1986, 01, 21));
        classMateBirthday.put("Ahmet", LocalDate.of(1990, 07, 25));

        System.out.println(classMateBirthday); // {Zarina=1986-01-21, Bakhodir=1986-01-21, Ahmet=1990-07-25}
        System.out.println(classMateBirthday.size()); // 3

        classMateBirthday.remove("Bakhodir");
        System.out.println(classMateBirthday); // {Zarina=1986-01-21, Ahmet=1990-07-25}
        System.out.println(classMateBirthday.size()); // 2

        classMateBirthday.put("Zarina", LocalDate.of(1986, 02, 22));
        System.out.println(classMateBirthday); // {Zarina=1986-02-22, Ahmet=1990-07-25}
        System.out.println(classMateBirthday.size()); // 2



    }

}
