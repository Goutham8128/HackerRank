package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaBehindTheScreens {
    public static void main(String[] args){
        System.out.println("");
        List<Integer> numList=List.of(23,45,33,32,16);

        FunctionalInterface(numList);

    }

    private static void FunctionalInterface(List<Integer> numList) {
        System.out.println(numList.stream().filter(n->n%2==0).collect(Collectors.toList()));
    }
}
