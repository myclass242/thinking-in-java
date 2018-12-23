package com.zy.innerClass;

public class ParCell2 {
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
        ParCell2 p2 = new ParCell2();
        p2.ship("ShenZheng");
        ParCell2 p22 = new ParCell2();
        //defining the references to inner classes
        ParCell2.Content c = p22.content();
        ParCell2.Destination d = p22.to("changsha");
    }
}
