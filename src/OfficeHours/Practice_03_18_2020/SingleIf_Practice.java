package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        boolean aGreater = a > b;
        boolean bGreater = b > a;
        boolean aEqualb = a == b;
    //    boolean aEgualb = aGreater == false && bGreater == false;
    //    boolean aEqualb = aGreater == bGreater;

    if(aGreater){

        System.out.println(a+" is greater number");
    }

    if(bGreater){
        System.out.println(b+" is greater number");
    }

    if(aEqualb){
        System.out.println(a+" is equal to "+b);
    }


    }


}
