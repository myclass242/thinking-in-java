package com.zy.innerClass;

class Parace4{
    private class PContent implements Content{
        private int i = 11;
        public int value()
        {
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String toWHere)
        {
            label = toWHere;
        }
        public String readLabel()
        {
            return label;
        }
    }
    public Content getContent()
    {
        return new PContent();
    }
    public Destination getDestination(String s)
    {
        return new PDestination(s);
    }
}

public class TestParcel {
    public static void main(String[] args)
    {
        Parace4 p4 = new Parace4();
        Content c = p4.getContent();
        Destination d = p4.getDestination("xiangtan");
//        Parace4.PContent pc = p4.new PContent();
    }
}
