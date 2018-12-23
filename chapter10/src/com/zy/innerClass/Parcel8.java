package com.zy.innerClass;

public class Parcel8 {
    public Wrapping wrapping(int x)
    {
        return new Wrapping(x){     //pass constructor argument
          public int value()
          {
              return super.value() * 47;
          }
        };
    }
    public static void main(String[] args)
    {
        Parcel8 p8 = new Parcel8();
        Wrapping wraping = p8.wrapping(2);
        System.out.println(wraping.value());
    }
}
