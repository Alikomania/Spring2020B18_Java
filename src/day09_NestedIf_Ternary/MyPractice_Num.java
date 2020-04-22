package day09_NestedIf_Ternary;

public class MyPractice_Num {
    public static void main(String[] args) {

        int n1 = 103;
        int n2 = 101;
        int n3 = 102;

        String result = (n1 == n2 && n2 == n3)? "All equal" :
                    (n1 == n2)? "n1 & n2 are equal" :
                        (n1 == n3)? "n1 & n3 are equal" :
                            (n2 == n3)? "n2 & n3 are equal" :
                                    "None of them equal";
        System.out.println(result);



        }



    }

