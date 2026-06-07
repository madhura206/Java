package com.company;

import java.awt.*;

//class Cylinder{
//    private int radius;
//    private int height;
//
//    public Cylinder(int radius, int height){
//        this.radius = radius;
//        this.height = height;
//    }
//
//    public void setRadius(int r){
//        radius = r;
//    }
//
//    public void setHeight(int h) {
//        height = h;
//    }
//
//    public int getRadius(){
//        return radius;
//    }

//    public int getHeight(){
//        return height;
//    }

//    public double SurfaceArea(){
//        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
//    }
//
//    public double Volume() {
//        return Math.PI * radius * radius * height;
//    }




//class Rectangle{
//    private int length;
//    private int breadth;
//
//    public Rectangle() {
//        this.length = 4;
//        this.breadth = 5;
//    }
//
//    public Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//
//    public int getLength(){
//        return length;
//    }
//
//    public int getBreadth(){
//        return breadth;
//    }
//}

class Sphere {
    private int radius;

    public void setRadius(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public double SurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }

    public double Volume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}



public class CWH44_PracticeSet {
    public static void main(String[] args) {
//        Cylinder myCylinder = new Cylinder(9,12);
//        Rectangle myRectangle = new Rectangle(); // Priority:  2,3 > 4,5
        Sphere mySphere = new Sphere();

//        myCylinder.setRadius(6);

//          Problem 1:
//        int h = myCylinder.getHeight();
//        int r = myCylinder.getRadius();
//        Problem 2:
//        System.out.println(myCylinder.SurfaceArea());
//        System.out.println(myCylinder.Volume());

//        Problem 3:
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.getHeight());

        //Problem 4:
//        System.out.println(myRectangle.getLength());
//        System.out.println(myRectangle.getBreadth());

//        Problem 5:

        mySphere.setRadius(4);
        int g = mySphere.getRadius();
        System.out.println(g);
        System.out.println(mySphere.SurfaceArea());
        System.out.println(mySphere.Volume());





    }




}
