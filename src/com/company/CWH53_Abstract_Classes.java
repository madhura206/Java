package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Main Parent ka constructor hoon");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();

}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH53_Abstract_Classes {
    public static void main(String[] args) {
//        Parent p = new Parent(); // error because it is an abstract class so no object instantiation
//        Child2 c = new Child2(); //error because it is an abstract class
        Parent c1 = new Child(); //No error. Here, Parent class is abstract and Child class is not.
    }
}
