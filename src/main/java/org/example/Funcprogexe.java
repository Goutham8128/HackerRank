package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Funcprogexe {
    public static void main(String[] args){
        System.out.println("");
        //List.of(Apple,banana,kiwi).stream()
        //Map of all these to lowercase and uppercase
        //List.of(Apple,ant,bat).stream()
        //print the length of each element

        List<Integer> numlist=List.of(12,20,5,25,80);
        List<String> fruitlist=List.of("apple","banana","kiwi");

        SquaresMethod(numlist);
        System.out.println("---------");
       // LowerCase(fruitlist);
        System.out.println(("---------"));
        //LengthOfEachElement(fruitlist);
    }

    private static void LengthOfEachElement(List<String> fruitlist) {
        fruitlist.stream().map(e->e.length()).forEach(element-> System.out.println(element));

    }

    public static void SquaresMethod(List<Integer> numlist) {
        System.out.println(numlist.stream().map(e->e*e).collect(Collectors.toList()));
    }


    public static void LowerCase(List<String> fruitlist) {
            fruitlist.stream().map(e->e.toUpperCase()).forEach(element-> System.out.println(element));
    }




}
