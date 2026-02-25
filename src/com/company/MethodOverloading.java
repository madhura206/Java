package com.company;

public class MethodOverloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){   //Here, a and b are paramters
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void change(int a){
         a = 98;
    }

    static void change2(int [] arr){
         arr[0] = 98; // the reference of the array(marks) is used/passed. So the value will change here from 92 to 98.
    }

    static void tellJoke(){  // when no return through method, you use void
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        tellJoke();

//        Case1: Changing the Integer
        int x = 45;
        change(x);
        System.out.println("The value of x after running change is: "+ x);

//        Case 2: Changing the Array
        int [] marks = {92, 75, 85, 68, 64};
        change2(marks);
        System.out.println("The value of marks[0] after running change2 function: " + marks[0]);

        //Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000); //3000 and 4000 are arguments. Arguments are actual.
        // Don't change method type i.e, void -> int, it will give error. Instead change parameters.

    }
}
