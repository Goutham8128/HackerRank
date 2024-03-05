package org.example;

public class Task1 extends Thread{
    public void run(){
        System.out.println("Task1 Kicked OFf");
        for(int i=9;i<100;i++){
            System.out.println(i+ " ");
        }
        System.out.println("Task1Done");
    }

}
