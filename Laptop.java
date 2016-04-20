package com.example.lesson20;

public class Laptop extends AbstractComputer {
    private String keyboardTypeByDefault;
    private String processorArchitecture;

    Laptop(String keyboardTypeByDefault, String processorArchitecture) {
        this.keyboardTypeByDefault = keyboardTypeByDefault;
        this.processorArchitecture = processorArchitecture;
    }

    @Override
    public String getKeyboardType() {
        return keyboardTypeByDefault;
    }

    @Override
    public void setKeyboardType(String keyboardTypeByDefault) {
        this.keyboardTypeByDefault = keyboardTypeByDefault;
    }

    @Override
    public void setProcessorArchitecture(String processorArchitecture) {
        this.processorArchitecture = processorArchitecture;
    }

    @Override
    public String getProcessorArchitecture() {
        return processorArchitecture;
    }
}