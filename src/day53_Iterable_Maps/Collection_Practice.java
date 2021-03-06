package day53_Iterable_Maps;

import java.util.*;

public class Collection_Practice {
    /*
    warmUp tasks:
	1. write a program that remove the duplicates from an array of String
	2. write a program that can remove the duplicates from an arrayList of String
	3. what are the differences between List and Set
			List: Accepts duplicates
			Set:
	4. how to achieve thread safety
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list = Collections.synchronizedList(list); // thread-safe

        Set<Integer> set = new HashSet<>();
        set = Collections.synchronizedSet(set);

        System.out.println("==============================================");

        String[] arr = {"E", "B", "A", "D", "D", "C", "A"}; // EBADC
        LinkedHashSet<String> st = new LinkedHashSet<>( Arrays.asList(arr) );
        /*
        for (String each : arr){
            st.add(each);
        }
        */
        System.out.println(st); // [E, B, A, D, C]

        ArrayList<String> arrayList = new ArrayList<>( Arrays.asList(arr) );
        System.out.println(arrayList); // [E, B, A, D, D, C, A]

        LinkedHashSet<String> st2 = new LinkedHashSet<>(arrayList);
        System.out.println(st2); // [E, B, A, D, C]

    }

    public synchronized void append(){

    }


}
