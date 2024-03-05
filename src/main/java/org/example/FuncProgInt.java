package org.example;

import java.util.List;

public class FuncProgInt {
    public static void main(String[] args){
        List<Integer> list=List.of(1,43,11,33,43,1,22);

      // Number(list);
       // NumberWithFP(list);
        //NumberwithFPSorted(list);
        NumberwithFPSortedDistinct(list);
    }

    public static void Number(List<Integer> list) {
        for(int num: list)
            System.out.println(num);
    }

    public static void NumberWithFP(List<Integer> list){
       int sum=list.stream()
               .filter(number->number%2!=0)
               .reduce( 0,(number1,number2 )->number1+number2);
        System.out.println(sum);
        }

        public static void NumberwithFPSorted(List<Integer> list){
        list.stream().sorted().forEach(element-> System.out.println(element));
        }

    public static void NumberwithFPSortedDistinct(List<Integer> list){
        list.stream().distinct().map(e->e*e).forEach(element-> System.out.println(element));
    }



}


