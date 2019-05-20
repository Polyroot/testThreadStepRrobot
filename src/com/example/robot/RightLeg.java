package com.example.robot;

public class RightLeg implements Runnable{

    private Head head;

    public RightLeg(Head head) {
        this.head = head;
    }

    @Override
    public void run() {

            try {

                while (true){

                head.waitLeftStep();
                head.stepRight();


                }
            } catch (InterruptedException e) {
                System.out.println("interrupted right step");
            }


    }
}
