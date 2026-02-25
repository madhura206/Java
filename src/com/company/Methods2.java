package com.company;

public class Methods2 {
    static void tellJoke(){  // when no return through method, you use void
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    static int logic(int x, int y){
        int z;
        if(x > y){
            z = x + y;
        }
        else{
            z = (x + y) * 5;
        }
        x = 566; //this does not affect the values of a amd b.
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
//        Method invocation using object creation
//        Methods2 obj = new Methods2();
//        c = obj.logic(a , b);
        c = logic(a , b); // Here, c == z

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1); // Here, c1 == z
        System.out.println(c);
        System.out.println(c1);

    }
}
