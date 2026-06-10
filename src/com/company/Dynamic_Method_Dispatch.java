package com.company;

class Phone{

    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on Phone...");

    }

}

class SmartPhone extends Phone{

    public void music(){
        System.out.println("Playing music...");
    }

    public void on(){

        System.out.println("Turning on SmartPhone...");
    }


}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//    Phone obj = new Phone();
//    obj.on();
//
//    SmartPhone obj2 = new SmartPhone();
//    obj2.on();

        Phone obj = new SmartPhone(); // IT is allowed. Runtime Polymorphism.
//        SmartPhone obj1 = new Phone();  Not allowed. reference of superclass can be equal to object of child class but vice versa is not allowed.
        obj.showTime(); // only one greet method is there
        obj.on(); // method under Smartphone will get printed.
//        obj.music(); // Not allowed
    }
}
