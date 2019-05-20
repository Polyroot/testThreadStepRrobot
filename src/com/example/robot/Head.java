package com.example.robot;

public class Head {

    boolean doubleStep = false;

    public synchronized void stepLeft(){
        System.out.println("Левый шаг");
        doubleStep = true;
        notifyAll();
    }

    public synchronized void stepRight(){
        System.out.println("Правый шаг");
        doubleStep = false;
        notifyAll();
    }

    public synchronized void waitLeftStep() throws InterruptedException{
        if (!doubleStep)
            wait();

    }

    public synchronized void waitRightStep() throws InterruptedException{
        if (doubleStep)
            wait();
    }

}
