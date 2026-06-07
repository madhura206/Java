package com.company;

class A{
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am a method 2 of class A");
    }
}

class B extends A{
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
    @Override // Override Annotation. we have override this method in this class. if this is present, then method name and parameters should be same. this is not compulsory to write
    public void meth2(){     // Method Overriding
        System.out.println("I am a method 2 of class B");
    }
}
public class CWH48_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();


    }
}
