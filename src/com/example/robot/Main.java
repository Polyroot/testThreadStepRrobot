package com.example.robot;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();
//        Runnable runnable1 = new MyRunnable2();
        Thread left = new Thread(runnable);
        Thread right = new Thread(runnable);
        left.setName("Левая нога делает шаг");
        right.setName("Правая нога делает шаг");
        left.start();
        right.start();

    }
}


class MyRunnable implements Runnable{

    private int balance;

    ArrayList<String> list = new ArrayList<>();


    @Override
    public void run() {

        for (int i=0; i<25; i++){

            String s = Thread.currentThread().getName();
            list.add(s);

            if (list.size()>1){

                if (!list.get(increment()-1).equals(s)){

                    System.out.println(s);
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public int increment(){

        balance++;
        return balance;
    }

}
