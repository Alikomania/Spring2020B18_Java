package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

        String str = "Java is fun, Java is cool".toLowerCase(); // line 10 and line 6 both are them lowerCase (same case)

        int count = 0; // 2 (Java)

        String word = "Java".toLowerCase(); // ignoring the case sensitivity by converting both string to lowerCase

        while (str.contains(word)){
            count++;
            str = str.replaceFirst("Java", ""); // after counting the first "Java"
                                         // we need to remove it from the str
        }
        System.out.println(count);




    }
}
