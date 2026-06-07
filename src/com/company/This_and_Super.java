package com.company;

class EkClass{
    int  a;

    EkClass(int a){
        this.a = a;  //Output is 0. even if argument is written.
    }

    public int getA(){
        return a;
    }

    public int returnOne(){
        return 1;
    }

}
public class This_and_Super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        System.out.println(e.getA());
    }
}
