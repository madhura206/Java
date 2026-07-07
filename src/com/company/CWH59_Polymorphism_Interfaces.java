package com.company;

interface myCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){ // classes can't use this.
        System.out.println("Good Morning!");
    }
    default void record4KVideo(){
        greet();// Don't want to force implementation of this method inside other classes. That's why written here like this.
        System.out.println("Record 4K Video");
    }
}
interface myWiFi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone2{
    void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class Smartphone2 extends myCellPhone implements myWiFi2, myCamera2{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    //    public void record4KVideo(){
//        System.out.println("Recording in 4k..."); // This method will work not the above one.
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Redmi", "iPhone", "samsungA36"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);

    }
    public void sampleMeth(){
        System.out.println("Method");
    }

}

public class CWH59_Polymorphism_Interfaces {
    public static void main(String[] args) {
        myCamera2 cam1 = new Smartphone2(); // this is a smartphone but use it as a camera. You can only use myCamera2 methods as it is referenced by myCamera2.
//        cam1.getNetworks(); --> Not allowed
//        cam1.sampleMethod(); --> Not allowed
        cam1.record4KVideo();
        Smartphone2 s = new Smartphone2(); // Can use Smartphone2 methods.
        s.callNumber(915651448);



    }
}
