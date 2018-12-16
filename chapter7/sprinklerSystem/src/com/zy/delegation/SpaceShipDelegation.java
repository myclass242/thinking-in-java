package com.zy.delegation;

public class SpaceShipDelegation {
    private SpaceShipControls controls = new SpaceShipControls();
    private String name;
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    public void up(int velocity){
        controls.up(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public static void main(String[] args){
        SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
        protector.up(100);
    }
}
