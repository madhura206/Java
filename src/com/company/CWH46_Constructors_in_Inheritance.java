package com.company;

class Base1{
    public int x;

    Base1(){
        System.out.println("I am a constructor");
    }

    Base1(int x){
        System.out.println("I am an overloaded constructor of Base1 with value of x: " + x);
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
}

class Derived1 extends Base1{
    public int y;

    Derived1(){
//        super(0);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived1 with value of y: " + y);
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y;
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived class");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a child of derived class with value of z:" + z);
    }


}
public class CWH46_Constructors_in_Inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1(6,7);
//        ChildOfDerived cd = new ChildOfDerived();
//        ChildOfDerived cd = new ChildOfDerived(12,13,15);
    }
}
