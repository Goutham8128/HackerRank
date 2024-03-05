package org.example;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args){
        System.out.println("FP Number runner");
        List<Integer> list= List.of(12,14,65,12,20);
        list.stream().forEach(element-> System.out.println(element));

        normalSum(list);



    }


    private static void normalSum(List<Integer> list) {
        int sum=0;
        for(int number: list){
            sum+=number;
        }
        System.out.println(sum);
    }
}
