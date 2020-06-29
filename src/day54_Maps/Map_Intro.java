package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Intro {

    public static void main(String[] args) {

        Map<String, Double> employeeInfo = new LinkedHashMap<>();
        employeeInfo.put("Zarina", 120000.0);
        employeeInfo.put("Bakhodir", 110000.50);

        System.out.println(employeeInfo); // {Zarina=120000.0, Bakhodir=110000.5}
        System.out.println(employeeInfo.size()); // 2 (Two 'pair' data)

        System.out.println(employeeInfo.get(0)); // null => Map doesn't has index number.
                                                // We should the key

        System.out.println(employeeInfo.get("Zarina")); // 120000.0
                                                 // When we give the key then print out the value
                                            // Every single value MUST have a key

        System.out.println(employeeInfo.get("Bakhodir")); // 110000.5

        // => remove(key)
        employeeInfo.remove("Bakhodir");
        System.out.println(employeeInfo); // {Zarina=120000.0}
        System.out.println(employeeInfo.size()); // 1

        employeeInfo.put("Zarina", 130000.0); // Key is unique, CANNOT duplicate.
                                            // value CAN be duplicate.
        System.out.println(employeeInfo); // {Zarina=130000.0}





    }
}
