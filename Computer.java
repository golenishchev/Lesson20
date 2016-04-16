package com.example.lesson20;

public interface Computer {
    final double PI = 3.14;  // variables "final" by default in interfaces.

    public abstract String getKeyboardType(); // it's "public abstract" by default in interfaces.

    void setKeyboardType(String keyboardTypeByDefault);
}
//https://www.youtube.com/watch?v=1PPDoAKbaNA