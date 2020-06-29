package day54_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class Map_SetEntries {

    public static void main(String[] args) {

        LinkedHashMap<String, String> fb = new LinkedHashMap<>();
        fb.put("Tester01", "password1");
        fb.put("Tester02", "password1");
        fb.put("Tester02", "password2");
        fb.put("Tester03", "password3");
        fb.put("Tester04", "password4");
        fb.put("Tester05", "password5");

        System.out.println(fb);

        System.out.println("=======================================================");
        
        fb.keySet();
        for (String eachKey : fb.keySet()) {
            System.out.println(eachKey + " " + fb.get(eachKey));
        }

        System.out.println("=====================================");

        fb.values();
        for (String eachValues : fb.values()){
            System.out.println(eachValues);
        }

        System.out.println("=============================================");

        List<String> password = new ArrayList<>(fb.values());
        System.out.println(password);

        List<String> userNames= new ArrayList<>(fb.keySet());
        System.out.println(userNames);

        System.out.println("================================================");







    }
}
