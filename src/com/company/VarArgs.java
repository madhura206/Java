package com.company;

public class VarArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
    //  INSTEAD OF THIS!
    // DO THIS:

    static int sum(int ...arr){
        // Available as int [] arr
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;

    }
//   Also:
//   static int sum(int x, int ...arr) Here, one argument is compulsory
//   public static void bar(int a, int arr)

    public static void main(String[] args) {
        System.out.println("Welcome to VarArgs tutorial");
        System.out.println("The sum is: " + sum(4,5,4,5,6,7));
        System.out.println("The sum of nothing is: "+ sum()); //Output: 0. Because arr is an empty array here.

    }
}

