package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class MySampleClass implements childSampleInterface{
    public void meth1(){ // inherit from sampleInterface
        System.out.println("Method 1");
    }
    public void meth2(){ // inherit from sampleInterface
        System.out.println("Method 2");
    }
    public void meth3(){
        System.out.println("Method 3");
    }
    public void meth4(){
        System.out.println("Method 4");
    }

}
public class CWH58_Inheritance_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
            obj.meth1();
            obj.meth2();
            obj.meth3();
            obj.meth4();
    }
}
