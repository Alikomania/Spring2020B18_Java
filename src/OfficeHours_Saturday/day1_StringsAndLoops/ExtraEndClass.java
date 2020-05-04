package OfficeHours_Saturday.day1_StringsAndLoops;

public class ExtraEndClass {

    public String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end + end + end;
    }

}
