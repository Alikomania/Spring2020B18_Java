package day37_Constructors;

public class ConstructorInfo {

    public ConstructorInfo(int a){

        System.out.println("Constructor with parameter of int");
    }

    public static void main(String[] args) {

    //    ConstructorInfo obj = new ConstructorInfo();

        ConstructorInfo obj2 = new ConstructorInfo(10);

        ConstructorInfo obj3 = new ConstructorInfo(10);

    }


}
