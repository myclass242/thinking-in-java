package com.zy.collections;

import java.lang.reflect.*;
import java.util.*;

public class SpringDetector {
    public static <T extends GroundHog>
    void detectSpring(Class<T> type) throws Exception {
        Constructor<T> ghog = type.getConstructor(int.class);
        Map<T, Prediction> map = new HashMap<>();
        for (int i = 0; i < 10; ++i) {
            map.put(ghog.newInstance(i), new Prediction());
        }
        System.out.println(map);

        GroundHog gh = ghog.newInstance(3);
        System.out.println("Looking up prediction for " + gh);
        if (map.containsKey(gh)) {
            System.out.println(map.get(gh));
        } else
        {
            System.out.println("key not found " + gh);
        }
    }
    public static void main(String[] args) throws Exception{
        detectSpring(GroundHog.class);
    }
}