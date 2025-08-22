package com.example.jsf_springboot_helloworld.bean;

import org.springframework.stereotype.Component;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;

@Component
@ViewScoped
public class HelloBean implements Serializable {

    private String message = "Hello World from JSF and Spring Boot!";
    private String name = "";
    private String personalizedMessage = "";

    public HelloBean() {
        System.out.println("HelloBean created!");
    }

    // Method to generate personalized greeting
    public void generateGreeting() {
        if (name != null && !name.trim().isEmpty()) {
            personalizedMessage = "Hello " + name + ", welcome to JSF with Spring Boot!";
        } else {
            personalizedMessage = "Please enter your name!";
        }
    }

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalizedMessage() {
        return personalizedMessage;
    }

    public void setPersonalizedMessage(String personalizedMessage) {
        this.personalizedMessage = personalizedMessage;
    }
}