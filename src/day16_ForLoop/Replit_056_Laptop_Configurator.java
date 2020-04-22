package day16_ForLoop;

import java.util.Scanner;

public class Replit_056_Laptop_Configurator {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if(screenSize == 13.3){
            price += 200;
        } else if(screenSize == 15.0){
            price += 300;
        } else if(screenSize == 17.3){
            price += 400;
        }
        scan.nextLine();
        System.out.println("Select CPU type:");
        cpu = scan.nextLine();
        if(cpu.equalsIgnoreCase("i3")){
            price += 150;
        } else if(cpu.equalsIgnoreCase("i5")){
            price += 250;
        } else if(cpu.equalsIgnoreCase("i7")){
            price += 350;
        }
        System.out.println("Select RAM size:");
        ram = scan.nextInt();
        for(int z = 4; z <= ram; z += 4){
            price += 50;
        }
        scan.nextLine();
        System.out.println("Select storage type:");
        storageType = scan.nextLine();
        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();
        if(storageType.equalsIgnoreCase("SSD")){
            for(int i = 0; i < memorySize; i += 500){
                price += 100;
            }
        } else if(storageType.equalsIgnoreCase("HDD")){
            for(int i = 0; i < memorySize; i += 500){
                price += 50;
            }
        }

        scan.nextLine();
        System.out.println("Enter screen resolution:");
        screenType = scan.nextLine();
        if(screenType.equalsIgnoreCase("fullhd")){
            price += 100;
        } else if(screenType.equalsIgnoreCase("4k")){
            price += 200;
        }

        System.out.println("Laptop price is: $"+price);



    }
}
