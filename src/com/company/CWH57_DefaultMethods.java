package com.company;

interface myCamera{
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
interface myWiFi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
            System.out.println("Connecting...");
        }
}

class Smartphone extends myCellPhone implements myWiFi, myCamera{
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

}
public class CWH57_DefaultMethods {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        String[] ar = s.getNetworks();
        for (String item : ar){
            System.out.println(item);
        }
        s.takeSnap();
        s.record4KVideo();
        //s.greet(); //Error because greet() method is private.
    }
}
