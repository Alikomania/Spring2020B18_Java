package BedTimeTasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;
public class WarmUp_05_01_2020 {

    /*
    1. write a program that can return the unique objects
    from an ArrayList of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {2,3,4};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. do not use any sort method
              4. use predicate and collections methods only
        Hint:   Collections.frequency() // will return the frequency
                removeIf( frequency == 1)  can keep the unique objects
                in arrayList
2. write a program that can return the duplicated objects from
an ArrayList of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {1,1,5,5};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. DO NOT use any sort method
              4. Use predicate and collections methods only
        Hint:   Collections.frequency() // will return the frequency
                removeIf( frequency > 1)  can keep the duplicated objects
                in arrayList

   3. task:
            1. create an ArrayList of string called country names
            2. write a program that can remove all the country names
            that have length of 10 or greater

    4. write a program that can extract the special characters,
    digits and letters from a string and stores them into separate
    ArrayLists of Character:
            ex:
                str = "ABCD123$%#@&456EFG!";

                output:
                    list1: {$, %, #, @, &, !}
                    list2: {A, B, C, D, E, F, G}
                    list3: {1, 2, 3, 4, 5, 6}

     */
    public static void main(String[] args) {

        // 1.

            ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
            Predicate<Integer> frq=j-> Collections.frequency(list,j)>1;
            list.removeIf(frq);
            System.out.println(list);


     // 2.
            ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
            Predicate<Integer> dub=j-> Collections.frequency(list2,j)==1;
            list2.removeIf(dub);
            System.out.println(list2);

    // 3.

            ArrayList<String> countryNames = new ArrayList<>();
            countryNames.addAll(Arrays.asList("France","Madagascar","North Korea", "Bosnia and Herzegovina", "Switzerland","Ireland", "Norway"));
            Predicate<String> moreLetter= each-> each.length() >=10;
            countryNames.removeIf(moreLetter);
            System.out.println(countryNames);




        }
    }

