package day26_MethodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {

        sum(10,20);
        sum(1.5,2.5);

        double num1 = sum(10, 15.5); // takes the double method. because int variable doesn't assign to double
        System.out.println(num1);

        // 25L, 30L
        double num2 = sum(25L, 30L);
        System.out.println(num2);

        // 5, 4
        //double num3 =  sum(5,4);   // vpoid method does not return any value
        //40L, 50L
        sum((int)40L, (int)50L);



    }


    public static void sum(int a, int b){ // void method does not return any value
        System.out.println(a+b);
    }

    public static double sum(double a, double b){
        return a+b;
    }


}
