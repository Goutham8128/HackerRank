package org.example;

public class ThreadBasicRunner {
    public static void main(String[] args){
        //Task1
        Task1 task1=new Task1();
        task1.start();

       Task2 task2=new Task2();
       Thread task2thread=new Thread(task2);
       task2thread.start();

    }

}
