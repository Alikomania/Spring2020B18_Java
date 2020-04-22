package day14_StringClass;

public class WebAddress {
    public static void main(String[] args) {
/*
 write a program that can validate
 if a web ddress is valid
     valid web address:
        MUST start with www.
          Must ends with  .com, or .edu, .net, .Gov
         */
        String website = "WWW.cybertek.Gov";
        website = website.toLowerCase();

// easy way:
        boolean validEnding = website.endsWith(".edu") ||
                website.endsWith(".com") || website.endsWith(".gov") ||
                website.endsWith(".net");

        if(website.startsWith("www.") && validEnding){
            System.out.println("Valid address");
        } else {
            System.out.println("Invalid Address");
        }

        /* My solution:

        if(website.startsWith("www.") && website.endsWith(".edu") ||
                website.endsWith(".com") || website.endsWith(".gov") ||
                website.endsWith(".net")){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        */



    }
}
