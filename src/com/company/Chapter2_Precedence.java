package com.company;

public class Chapter2_Precedence {
    public static void main(String[] args) {
        /*
        =30-34/2
        =30-17
        =13
         */
//        int a = 6*5-34/2;
//        int b = 60/5-34*2;
        /*
        =12-34*2
        =12-68
        =-56
         */
//        System.out.println(b);

//        quick quiz
        int b = 1;
        int c = 4;
        int a = 5;
        int k = b * b - (4*a*c)/(2*a);
        System.out.println(k);


    }

}
