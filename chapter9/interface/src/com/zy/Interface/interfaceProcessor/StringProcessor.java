package com.zy.Interface.interfaceProcessor;

import java.util.*;

public abstract class StringProcessor implements MyProcessor{
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
    public static String s = "If she weights the same as a duck, she's made of wood";
    public static void main(String[] args){
        Apply.process(new Upcase(), s);
        Apply.process(new DownCase(), s);
        Apply.process(new Splitter(), s);
    }
}
class Upcase extends StringProcessor {
    public String process(Object input){
        return ((String)input).toUpperCase();
    }
}
class DownCase extends StringProcessor{
    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}
class Splitter extends StringProcessor{
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}