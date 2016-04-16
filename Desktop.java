package com.example.lesson20;

public class Desktop extends AbstractComputer implements Computer {
    private String keyboardTypeByDefault;
    private String processorArchitecture;

    Desktop(String keyboardTypeByDefault) {
        this.keyboardTypeByDefault = keyboardTypeByDefault;
    }

    public String getKeyboardType() { // can't be more restrictive than inside interface class.
        return keyboardTypeByDefault;
    }

    public void setKeyboardType(String keyboardTypeByDefault) {
        this.keyboardTypeByDefault = keyboardTypeByDefault;
    }

    public void setProcessorArchitecture(String processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
    }

    public String getProcessorArchitecture() {
        return processorArchitecture;
    }
}
//https://www.youtube.com/watch?v=1PPDoAKbaNA