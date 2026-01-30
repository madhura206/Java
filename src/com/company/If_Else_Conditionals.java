package com.company;

public class If_Else_Conditionals {
    public static void main(String[] args) {
        int age = 18; //No
        boolean cond = (age==18);

        if(cond){  // put = only for boolean inside if and == for int and all because for == datatype should be same i.e. age != 18.
            System.out.println("Yes boy you can drive");
        }  // not necessary to add else block.
        else{
            System.out.println("No boy you cannot drive yet");
        }
    }
}
