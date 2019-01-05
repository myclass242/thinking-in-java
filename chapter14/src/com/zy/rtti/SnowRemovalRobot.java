package com.zy.rtti;

import java.util.*;

public class SnowRemovalRobot implements Robot {
    private String name;
    public SnowRemovalRobot(String name) {this.name = name;}
    public String name() {return name;}
    public String model() {return "SnowBot Series 11";}
    public List<Operation> operations() {
        return Arrays.asList(
          new Operation() {
                public String description() {
                    return name + " can shovel snow";
                }
                public void command() {
                    System.out.println(name + "shoveling snow");
                }
            },
            new Operation() {
                public String description() {
                    return name + " can chis ice";
                }
                public void command() {
                    System.out.println(name + "chiping ice");
                }
            },
            new Operation() {
                public String description() {
                    return name + " can clear the roof";
                }
                public void command() {
                    System.out.println(name + "clearning the roof");
                }
            }
        );
    }
    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }
}
