package com.company;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public int inc() {
        return ++count;
    }

    public int dec() {
        return --count;
    }
}
