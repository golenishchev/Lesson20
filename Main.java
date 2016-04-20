package com.example.lesson20;

public class Main {
    public static void main(String[] args) {
        Computer myDesktop = new Desktop("USB-Keyboard", "AMD64");
        Computer myLapton = new Laptop("Built-In Keyboard", "x86-64");
        Computer myTablet = new Tablet("On-Screen Keyboard", "ARM64");
        System.out.println("Desktop default keyboard type: " + myDesktop.getKeyboardType());
        System.out.println("Laptop default keyboard type: " + myLapton.getKeyboardType());
        System.out.println("Tablet default keyboard type: " + myTablet.getKeyboardType());
        System.out.println("Desktop CPU architecture: " + myDesktop.getProcessorArchitecture());
        System.out.println("Laptop CPU architecture: " + myLapton.getProcessorArchitecture());
        System.out.println("Tablet CPU architecture: " + myTablet.getProcessorArchitecture());
    }
}