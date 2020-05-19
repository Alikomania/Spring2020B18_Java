package day42_Inheritance;

class Test {

    public Test(int a){ // if parent class' constractor is default, sub class automatically calling
                        // if parent class' constractor is NOT default, we MUST call MANUALLY in sub class, by 'super' keyword
        System.out.println("A");
    }

    public Test(double a){
        System.out.println("C");
    }

}


public class Constructor2 extends Test {

    public Constructor2(){
        super(15.5); // C
        System.out.println("B"); // B
    }

    public static void main(String[] args) {

    //    Test obj = new Test(10); // A

        Constructor2 obj2 = new Constructor2(); // CB

    }

}
