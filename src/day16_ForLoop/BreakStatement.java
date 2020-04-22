package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++ ){

        //  if(i == 3){ // 1 & 2; not others (Because before the print statement)
         //       break; // print only twice
          //  }

            System.out.println("Hello World");
         //   break; // executed the statement immediately (1 time, not the 5)

            if(i == 3){
                break; // executed 3 times. 1st print statement (i=1), other 2 break statement (i=2, i=3)
            }
        }


        for(char i = 'a'; i <= 'z'; i++){

            // if(i == 'd'){
            //   break; // until d, excluding d

            System.out.println(i);

            if(i == 'd'){
                break; // until d, including d
            }
        }


    }
}
