package com.zy.innerClass;

public class ParCell3 {
    class Content{
        private int value = 11;
        public int value()
        {
            return value;
        }
    }
    class Destination{
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel()
        {
            return label;
        }
    }
    public Destination to(String dest)
    {
        return new Destination(dest);
    }
    public Content content()
    {
        return new Content();
    }
    public void ship(String dest)
    {
        Content c = new Content();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args)
    {
        ParCell3 p2 = new ParCell3();
        ParCell3.Content pc = p2.new Content();
        ParCell3.Destination pd = p2.new Destination("xingyu");
    }
}
