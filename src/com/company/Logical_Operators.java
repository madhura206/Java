package com.company;

public class Logical_Operators {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        if(a && b) {
            System.out.println("Y");
        }
        else{
            System.out.println("N");

        }

        if(a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        System.out.println("For Logical  NOT");
        System.out.println("Not(a) is: " + !a);
        System.out.println("Not(b) is: " + !b);

    }
}
