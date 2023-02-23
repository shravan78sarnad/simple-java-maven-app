package com.mycompany.app;

/**
 * Hello devops!
 */
public class App
{

    private final String message = "Hello vinod!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
