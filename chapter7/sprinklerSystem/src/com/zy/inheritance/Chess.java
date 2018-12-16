package com.zy.inheritance;

class Game{
    Game(int i){
        System.out.println("Game()");
    }
}
class BoardGame extends Game{
    BoardGame(int i){
        super(i);
        System.out.println("BoardGame()");
    }
}

public class Chess extends BoardGame{
    Chess(){
        super(11);
        System.out.println("Chess()");
    }
    public static void main(String[] args){
        Chess c = new Chess();
    }
}
