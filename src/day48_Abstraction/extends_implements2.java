package day48_Abstraction;

interface P {
    void method1();
}

interface Q {
    int method2();
}

abstract class R  {
    abstract void method3();
}


public class extends_implements2 extends R implements P, Q {


    public static void main(String[] args) {

    //    R obj = new R(); not concrete
    //    Q obj2 = new Q(); not concrete. also its not also class. constructor came from class

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }
}
