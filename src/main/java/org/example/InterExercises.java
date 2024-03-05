package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterExercises {
    public static void main(String[] args){
        //first exercise--to pick even numbers into the list
        //create a list of squares of first ten integers and take it in the lsit

        List<Integer> numList= List.of(12,32,25,60,30);
        ListOP(numList);
        ListSquaresOP(numList);

    }

    public static void ListOP(List<Integer> numList) {
        System.out.println(numList.stream().map(e->e*e).collect(Collectors.toList()));
    }

    public static void ListSquaresOP(List<Integer> numList) {
        System.out.println(numList.stream().filter(n->n%2==0).collect(Collectors.toList()));
    }


}
