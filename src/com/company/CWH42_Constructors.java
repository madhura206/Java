package com.company;

class MyMainEmployee{
    private int id;
    private String name;


    public void setName(String n){
        name= n;
    }

    public String getName(){
        return name;
    }
    public void setID(int i){
        id = i;
    }

    public int getID(){
        return id;
    }

    public MyMainEmployee(){   // gets automatically invoked
        id = 0;
        name = "myName";

        // if you have put parameters in this constructor, then you have to put arguments in the object named "madhura".
    }

    public MyMainEmployee(int myId) {   // gets automatically invoked
        id = 3;
    }

    public MyMainEmployee(String myName) {   // gets automatically invoked
        id = 1;
        name = myName;
    }
}
//public class rCWH42_Constructors {
//    public static void main(String[] args) {
//        MyMainEmployee madhura = new MyMainEmployee();
////        MyMainEmployee madhura = new MyMainEmployee(); // no arguments in here, then MyMainEmployee constructor will get executed.
////        madhura.setID(83);
////        madhura.setName("Madhura");
//        System.out.println(madhura.getID()); //Output = 45 when above two are commented out
//        System.out.println(madhura.getName());  //Output = Madhura when above two are commented out
//
//    }
//}
