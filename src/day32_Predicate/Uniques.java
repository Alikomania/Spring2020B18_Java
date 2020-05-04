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

      System.out.println("=============================================");

      Character[] chars1 = {'A', 'A', 'B', 'B', 'C', 'D', 'D', 'E'};

      ArrayList<Character> charList1 = new ArrayList<>(Arrays.asList(chars1));
      System.out.println(charList1);

      ArrayList<Character> result1 = new ArrayList<>();

      for (Character each : charList1){
          int count1 = 0;
          for (Character each1 : charList1) if (each == each1) count1++;
          if (count1 == 1) result1.add(each);
      }
      System.out.println(result1);



  }

  }

