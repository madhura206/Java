package com.company;

import java.sql.SQLOutput;

public class Break_and_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Java is great");

            if (i == 2) {
                break;  // It will print till i==2. The control gets out of the loop.
            }
        }
        System.out.println("Ending the loop");

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Java is great");

            if (i == 2) {
                break;  // It will print till i==2. The control gets out of the loop.
            }
            i++;
        }
        System.out.println("Loop ends here!");

        for (i = 0; i < 50; i++) {
            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");


        }
        System.out.println("Ending the loop");

        // Using do while:

        do {
            i++;
            if (i == 2) {
                System.out.println("2 is skipped");
                continue;
            }
            System.out.print(i + ". ");
            System.out.println("Java is Great");
        }while(i<5);


    }
}
