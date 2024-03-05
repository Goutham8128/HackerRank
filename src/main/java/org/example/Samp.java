package org.example;

public class Samp {

    public static void main(String[] args){
        System.out.println("Testing variable arguemnts");
        System.out.println("Sum of two arguements is: "+sum(1,3));
        System.out.println(sum(4,5,5));
        System.out.println(sum(434,343,3433,4,3,3));
    }

    private static int sum(int... values){
        int tsum=0;
        for(int val:values){
            tsum+=val;
        }
        return tsum;
    }
}
