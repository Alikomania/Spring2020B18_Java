package day54_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_setEntry {

    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();

        countries.put("Turkey", "Ankara");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("USA", "Washington DC");
        countries.put("Spain", "Madrid");

        String input = "Turkey";
        for (Map.Entry<String, String> each : countries.entrySet() ) {
           // System.out.println(each.getKey() +"'s capital is: "+ each.getValue());

            String countryName = each.getKey();
            String cityName = each.getValue();

            if (input.equalsIgnoreCase(countryName)){
                System.out.println(cityName);
            }
        }






    }
}
