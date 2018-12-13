package com.zy.util;

import org.jetbrains.annotations.Contract;

public class Range {
    @Contract(pure = true)
    public static int[] range(int n)
    {
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = i;
        }
        return arr;
    }
    @Contract(pure = true)
    public static int[] range(int start, int end)
    {
        int length = end - start;
        int[] arr = new int[length];
        for (int i = 0; i < length; ++i)
        {
            arr[i] = start + i;
        }
        return arr;
    }
    @Contract(pure = true)
    public static int[] range(int start, int end, int step){
        int length = (end - start) / step;
        int[] arr = new int[length];
        for (int i = 0; i < length; ++i){
            arr[i] = start + i * step;
        }
        return arr;
    }
}
