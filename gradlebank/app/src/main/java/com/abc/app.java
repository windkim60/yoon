package com.abc;

public class app {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new app().getGreeting());
    }
}