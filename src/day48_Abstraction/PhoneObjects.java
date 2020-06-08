package day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone iphone1 = new iPhone("X", 1000, "10 inches");
        iPhone iphone2 = new iPhone("11", 1100, "11.6");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.FaceTiming(12345678);
        iphone2.calling(4321567);

        System.out.println("=====================================================");

        Samsung samsung1 = new Samsung("S10", 700, "11 inches" );

        System.out.println(samsung1);

        samsung1.calling(2345167);
        samsung1.freezing();


    }


}
