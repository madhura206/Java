package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}


class Avon implements Bicycle, HornBicycle {
    void blowhorn(){
        System.out.println("Peeee Peeeee Poooo Pooooo!!");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brakes");
    }
    public void speedUp(int increment){
        System.out.println("Speeding up!");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn(){
        System.out.println("Main hoon na po po po po ");
    }


}
public class CWH54_Interfaces {
    public static void main(String[] args) {

        Avon cycle = new Avon();
        cycle.applyBrake(1);
        System.out.println(cycle.a); //Output 45
        // You can create properties in interfaces
        // You cannot modify the properties in interfaces.
        //cycle.a = 455; // Error. It is a final variable

        cycle.blowHornk3g();
        cycle.blowHornmhn();
    }
}
