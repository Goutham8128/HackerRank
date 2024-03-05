package org.example;

public class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task2 Kicked OFf");
        for(int i=201;i<300;i++){
            System.out.println(i+ " ");
        }
        System.out.println("Task2Done");
    }
    }

