package day06_Shorthnd_LogicalOpertators;

public class ShorthndOperators {
    public static void main(String[] args) {

        int x = 20;
        x += 10; //  x = x + 10 = 30
        System.out.println(x);

        x += 60; // x = x + 60 = 90
        System.out.println(x); // 90

        String schoolname = "Cybertek";
        schoolname += 12345; // shoolname = schoolname + 12345
        System.out.println(schoolname);

        System.out.println('a'+'b'); // 97 + 98 = 195

        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1); // character

        int num = 'z';
            num = 'x';
        System.out.println(num); // number (Because dataType belirleyici.
        // Int is a number but char is single chracter)

        int A = 100;
        A -= 90;

        System.out.println(A); // 10

        int B = 200;
            B -= A; // B = B = A
        System.out.println(B); // 190

        int a = 2;
                a*= 3; /// 6
        int b = a *= 10;
        // b = a = a * 10 = 60
        System.out.println(b); // 60
        System.out.println(a); //60




    }


}
