package com.example.robot;

public class LeftLeg implements Runnable{

    private Head head;

    public LeftLeg(Head head) {
        this.head = head;
    }

    @Override
    public void run() {

        try {
            while (true){

                head.stepLeft();
                head.waitRightStep();

            }

        } catch (InterruptedException e) {
            System.out.println("interrupted left step");
        }

    }

}
