package day21_MultiDimensionalArrays;

import javax.print.DocFlavor;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "Crocodile"};
        String[] birds = {"Eagle", "Ducks", "Peacock", "Chicken"};

        String[][] zoo = {wildAnimals, birds};
            // index num =>   0          1

        String kfc = zoo[1][3];
        System.out.println(kfc);
        String duck = zoo[1][1];
        System.out.println(duck);

        System.out.println("========================================");

        for (String eachBirds : zoo[1]){
            if(eachBirds.equalsIgnoreCase("chicken"))
                continue;
            System.out.println(eachBirds); // Eagle Duck Peacock
        }

        System.out.println("=======================================");

        for (String eachWilds : zoo[0]){
            if(eachWilds.equalsIgnoreCase("turtle"))
                continue;
            System.out.println(eachWilds);
        }






    }
}
