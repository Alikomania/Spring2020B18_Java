package day08_IfStatements;

public class MultiBranchIf {
    public static void main(String[] args) {

        int a = 0;

        boolean zero = a == 0;
        boolean negative = a < 0;
        boolean positive = a > 0;

        if(zero){
            System.out.println("zero");
        } else if(negative){
            System.out.println("negative");
        } else {
            System.out.println("positive");
        }



    }
}
