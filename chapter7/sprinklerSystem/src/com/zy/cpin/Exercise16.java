package com.zy.cpin;

class Amphibian{
    void a(){
        System.out.println("a()");
    }
    void b(int k){
        System.out.println("b(int)");
    }
}
class Frog extends Amphibian{
    void a(){
        System.out.println("Frog.a()");
    }
}

public class Exercise16 {
    static void f(Amphibian am){
        am.a();
        am.b(3);
    }
    public static void main(String[] args){
        Frog f = new Frog();
        Exercise16.f(f);
    }
}
