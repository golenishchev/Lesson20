package com.example.lesson20;

public interface Computer {
    String getKeyboardType();

    void setKeyboardType(String keyboardTypeByDefault);

    void setProcessorArchitecture(String processorArchitecture);

    String getProcessorArchitecture();
}