package com.zy.enums;

enum Signal {GREEN, YELLOW, RED}

public class TrafficLight {
    private Signal signal;
    TrafficLight() {
        signal = Signal.GREEN;
    }
    public String toString() {
        return "The traddic light is " + signal;
    }
    public void change() {
        switch (signal) {
            case GREEN: {
                signal = Signal.YELLOW;
                break;
            }
            case YELLOW: {
                signal = Signal.RED;
                break;
            }
            case RED: {
                signal = Signal.GREEN;
                break;
            }
            default: {
                System.out.println("Error");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight();
        for (int k = 0; k < 7; ++k) {
            System.out.println(tl);
            tl.change();
        }
    }
}
