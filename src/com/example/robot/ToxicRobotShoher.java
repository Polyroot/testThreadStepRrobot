package com.example.robot;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ToxicRobotShoher {


    public static void main(String[] args) {

        Head head = new Head();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new LeftLeg(head));
        exec.execute(new RightLeg(head));
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            System.out.println("ff");
        }
        exec.shutdownNow();



    }

}
