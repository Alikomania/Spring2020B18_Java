package day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques { /// LOOK AT DAY30 Uniques ///
  /*
    write a program that can print out the unique objects
    from Arraylist of characters

   */
  public static void main(String[] args) {  /// LOOK AT DAY30 Uniques ///

      Character[] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

      ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
      System.out.println(charList);

      ArrayList<Character> result = new ArrayList<>(); // [B,C]

      for (Character each : charList){
          int count = Collections.frequency(charList, each);
          if (count == 1){
              result.add(each);
          }
      }
      System.out.println(result);



  }
}
