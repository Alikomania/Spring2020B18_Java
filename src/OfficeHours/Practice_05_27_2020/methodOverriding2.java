package OfficeHours.Practice_05_27_2020;

public class methodOverriding2 {

    protected void method1(){

    } // ONLY the INSTANCE method (Visible one) CAN be overriding

    public static void method2(){

    } // static method CANNOT be overriding

    public methodOverriding2(){ // constructor CANNOT be overriding

    }

}

class TestClass extends methodOverriding2 {
    @Override
    protected void method1(){

    } // ONLY the INSTANCE method (Visible one) CAN be overriding

    public static void method2(){

    } // static method CANNOT be overriding

  //  public methodOverriding2(){ // constructor CANNOT be overriding

    }


