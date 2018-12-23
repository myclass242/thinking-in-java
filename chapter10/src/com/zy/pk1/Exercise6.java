package com.zy.pk1;

import com.zy.innerClass.Content;

public class Exercise6 {
    protected class EContent implements Content{
        private int i = 6;
        public int value()
        {
            return i;
        }
        public EContent(){}
    }
}
