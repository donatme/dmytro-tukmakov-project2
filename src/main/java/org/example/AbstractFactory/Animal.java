package org.example.AbstractFactory;

public abstract class Animal {
    public void eat() {
        System.out.println("eaten");
    }

    abstract public void multiply();

    abstract public void directionToTravel();
}
