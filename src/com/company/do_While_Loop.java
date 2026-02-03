package com.company;

public class do_While_Loop {
    public static void main(String[] args) {
        //In do while, control first go inside the brackets once before checking the condition
        int b = 90;
        do {
            System.out.println(b);
            b++;
        } while (b < 52);
        // output: 90

        //Practice
        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=100);
    }
}
