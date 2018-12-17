package com.zy.polymorphic;

//Dynamicly changing the behavior of an object
//Via composition(the "State" design pattern)

class Act{
    public void act(){};
}
class HappyAct extends Act{
    @Override public void act(){
        System.out.println("HappyAct");
    }
}
class SadllyAct extends Act{
    public void act(){
        System.out.println("SadllyAct");
    }
}
class Stage{
    private Act act = new HappyAct();
    public void change(){
        act = new SadllyAct();
    }
    public void performPlay(){
        act.act();
    }
}
public class Transmogrify {
    public static void main(String[] args){
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
