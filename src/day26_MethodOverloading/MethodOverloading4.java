package day26_MethodOverloading;

public class MethodOverloading4 {
                                        // Overloading methods can apply main method BUT
    public static void main(String[] args) { // ONLY executed the original (String one) main method
                                            // NOT the others

        System.out.println("String");
    }

    public static void main(double[] args){
        System.out.println("Double");
    }

    public static void main(int[] args){
        System.out.println("Int");

    }
}
