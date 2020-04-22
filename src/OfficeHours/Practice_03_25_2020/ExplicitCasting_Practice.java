package OfficeHours.Practice_03_25_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {

        byte bnum = 100; // smaller to
        short snum = bnum; // bigger ==> this is implicit casting

        int iNum = 200; // bigger to
        short sNum = (short) iNum; // smaller ==> Explicit

        float fNum = (float) 0.5;
        System.out.println(fNum); // 0.5

        float fNum2 = (long)0.5;
        System.out.println(fNum2);

        // long, int, short, byte ==> only accepts whole numbers






    }



}
