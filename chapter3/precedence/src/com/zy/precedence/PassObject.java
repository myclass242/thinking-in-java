package com.zy.precedence;

public class PassObject {
    static void f(Letter y)
    {
        y.c = 'z';
    }
}

class Letter
{
    char c;
}
