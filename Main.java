package com.example.lesson20;

public class Main {
    private static Desktop myDesktop;
    private static Laptop myLapton;
    private static Tablet myTablet;

    public static void main(String[] args) {
        myDesktop = new Desktop("USB-Keyboard");
        myLapton = new Laptop("Built-In Keyboard");
        myTablet = new Tablet("On-Screen Keyboard");
        System.out.println("Desktop default keyboard type: " + myDesktop.getKeyboardType());
        System.out.println("Laptop default keyboard type: " + myLapton.getKeyboardType());
        System.out.println("Tablet default keyboard type: " + myTablet.getKeyboardType());
        myDesktop.setProcessorArchitecture("AMD64");
        myLapton.setProcessorArchitecture("x86-64");
        myTablet.setProcessorArchitecture("ARM64");
        System.out.println("Desktop CPU architecture: " + myDesktop.getProcessorArchitecture());
        System.out.println("Laptop CPU architecture: " + myLapton.getProcessorArchitecture());
        System.out.println("Tablet CPU architecture: " + myTablet.getProcessorArchitecture());
    }
}
//https://www.youtube.com/watch?v=1PPDoAKbaNA