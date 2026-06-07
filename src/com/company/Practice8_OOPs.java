package com.company;
//no duplicate classes in same package
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void silent(){
        System.out.println("Silent...");
    }
}

class square{
    int side;


    public int area(){
        return side * side;
    }

    public int perimeter(){
        return side * 4;
    }
}

class Tommy{
    public void hitting(){
        System.out.println("Hitting the enemy!!");
    }
    public void running(){
        System.out.println("Running from the enemy!!");
    }
    public void firing(){
        System.out.println("Firing on the enemy!!");
    }

}
public class Practice8_OOPs {
    public static void main(String[] args) {
        /*
        //Problem 1
    Employee1 madhura = new Employee1();
    int salary = madhura.getSalary();
    madhura.setName("Code With harry");
    System.out.println(madhura.getName());
    madhura.salary = 150000;
    System.out.println(madhura.getSalary());

    //Problem 2
    CellPhone asus = new CellPhone();
    asus.ringing();
    asus.vibrate();
    asus.silent();


    //Problem 3
    square sq = new square();
    sq.side = 6;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());


         */

    Tommy cj = new Tommy();
    cj.hitting();
    cj.running();
    cj.firing();

    }
}
