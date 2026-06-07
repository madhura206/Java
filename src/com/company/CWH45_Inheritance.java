package com.company;


class Base{
    int x;
    public void printMe(){
        System.out.println("I am a constructor");
    }

    public int getX(){
        return x;
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}
// Dont reinvent the wheel, instead use inheritance.
class Derived extends Base{ // changes in base alsop affects Derived.
    int y;

    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

}


public class CWH45_Inheritance {
    public static void main(String[] args) {
        //Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //object of derived class or child class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());

    }
}
