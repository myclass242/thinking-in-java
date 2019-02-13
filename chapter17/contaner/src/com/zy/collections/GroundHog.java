package com.zy.collections;

import java.util.*;

public class GroundHog {
    protected int number;
    public GroundHog(int n) { number = n; }
    public String toString() {
        return "Groundhog#" + number;
    }
    public int hashCode() {
        return number;
    }
    public boolean equals(Object rhs) {
        return (rhs instanceof GroundHog) &&
                (number == ((GroundHog) rhs).number);
    }
}
