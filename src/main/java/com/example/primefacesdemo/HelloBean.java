package com.example.primefacesdemo;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class HelloBean implements Serializable {
    private String name;
    private String greeting;

    public void generateGreeting() {
        this.greeting = "Hello, " + (name != null ? name : "World") + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
} 