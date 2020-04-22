package BedTimeTasks;

public class StringValue {
    public static void main(String[] args) {

        /*
        3. Write a program that can print out the
        unique values from  String Array
         */

        int count = 0;
        String[] str = {"A", "B", "A", "C", "B", "E", "E"};

        for (int i = 0; i < str.length; i++){
            count = 0;
            for (int j = 0; j < str.length; j++){
                if (str[i] == str[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(str[i]);
            }

        }

    }
}
