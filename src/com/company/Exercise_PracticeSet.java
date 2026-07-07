package com.company;

class Circle {
    public int radius;

    Circle() {
        System.out.println("I am non param constructor");
    }

    Circle(int r) {
        System.out.println("I am circle parametrized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

}

class Cylinder extends Circle{
    public int height;


    Cylinder(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }


    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

class Rectangle{
    public int length;
    public int breadth;

    Rectangle(){
        System.out.println("I am a non param rectangle");

    }

    Rectangle(int l, int b){
        System.out.println("I am a parameterized rectangle");

    }

    public int area(int l, int b){
        return l * b;
    }

//    public void setRectangle(int l, int b){
//        this.length = l;
//        this.breadth = b;
//    }
//
//    public int getLength(){
//        return length;
//    }
//
//    public int getBreadth(){
//        return breadth;
//
//    }

}

class cuboid extends Rectangle{
    public int height;

    cuboid(){
        System.out.println("I am a non param cuboid");
    }

    cuboid(int l, int b){
        super(l,b);
        System.out.println("I am a parameterized cuboid");

    }

    public int area(int l, int b, int h){
        return l * b * h;
    }

    public void setRectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;

    }
}

public class Exercise_PracticeSet {
    public static void main(String[] args) {
//        Circle obj = new Circle(12);
//        Cylinder obj1 = new Cylinder(2,8);
        Rectangle r = new Rectangle();
        cuboid c = new cuboid();
        System.out.println(c.area(2,3,4));
        c.setRectangle(3,5);
        System.out.println(c.getLength());
        System.out.println(c.getBreadth());

    }
}
