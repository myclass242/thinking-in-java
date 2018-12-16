package com.zy.propercleanup;

class Component1{
    Component1(){
        System.out.println("Component1()");
    }
    void dispose(){
        System.out.println("Component1.dispose()");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2()");
    }
    void dispose(){
        System.out.println("Component2.dispose()");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3()");
    }
    void dispose(){
        System.out.println("Component3.dispose()");
    }
}
class Root2{
    Component1 c1;
    Component2 c2;
    Component3 c3;
    Root2(){
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Root2()");
    }
    void dispose(){
        c3.dispose();
        c2.dispose();
        c1.dispose();
        System.out.println("Root2.dispose()");
    }
}
public class Exercise12 extends Root2{
    Component1 c1;
    Component2 c2;
    Component3 c3;
    Exercise12(){
        super();
        c1 = new Component1();
        c2 = new Component2();
        c3 = new Component3();
        System.out.println("Exercise12()");
    }
    void dispose(){
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
        System.out.println("Exercise12.dispose()");
    }
    public static void main(String[] args){
        Exercise12 e12 = new Exercise12();
        try{
            // code and exception handling
        } finally{
            e12.dispose();
        }
    }
}
