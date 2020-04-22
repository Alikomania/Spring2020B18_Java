package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] friends = { "Kuzzat", "Asiya", "Saim", "Akbar", "Marufjon", "Guljannat", "Murodil"};
                    //          0         1       2        3        4               5          6
/*
        String a = friends[2];
        System.out.println(a); // Saim

        System.out.println(friends[6]); // Murodil

 */
    for(int i = 0; i <= 6; i++){
        String name = friends[i];
        System.out.print(name+" "); // Kuzzat Asiya Saim Akbar Marufjon Guljannat Murodil

    }
        System.out.println("====================================");

    String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@hotmail.com"};
            // print out all the users who registered with their gmail
        // max: 4

        for(int i = 0; i <= 3; i++){
            String email = emails[i];
         if(email.endsWith("@gmail.com")){
             System.out.println(email);
         }

        }






    }
}
