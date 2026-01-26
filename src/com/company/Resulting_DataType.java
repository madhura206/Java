package com.company;

public class Resulting_DataType {
    public static void main(String[] args) {
//        int a = 45 + 4;
//        byte x = 5;
//        int y = 6;
//        short z = 8;
//        float b = 6.54f + 6;

        int i = 56;
        int b = i++; //first b is assigned i(56) and then i will be incremented
        int j = 67;
        int c= ++j; //first j is incremented then c is assigned j(68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        int  y = 7;
        System.out.println(++y * 8);
        char ch = 'a';
        System.out.println(++ch); //a ki value b ho jayegi.


    }
}
