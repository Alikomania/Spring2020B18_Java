package day16_ForLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        // skip print Y, H, J, D,

        for(char ch = 'Z'; ch >= 'A'; ch-- ){
            if(ch == 'Y' || ch == 'H' || ch == 'J' || ch == 'D'){ // && logic not gonna works
                continue;

            }

            System.out.print(ch+" ");

        }
        System.out.println();

        for(int i = 1; i <= 100; i++){
            if(i%3==0 || i%5==0){// Skip numbers divisible by 3 or 5
                                // if we used && => skip numbers divisible by 3 and 5 same times (15, 45, 75)
                continue; // skip that numbers divisible by 3 and 5
            }

            System.out.print(i+" ");

        }




    }
}
