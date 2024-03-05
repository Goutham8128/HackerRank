package org.example;

import java.util.List;

public class FunctionalProgramInt {
    public static void main(String[] args){
        List<Integer> list=List.of(1,2,5,6,7,6,10);

        //intList(list);
        //intFPlist(list);
        intFPlistFilteredE(list);
        intFPlistFilteredO(list);
    }



    private static void intList(List<Integer> list) {
        for(Integer iterator: list){
            System.out.println(iterator);
        }
    }
    private static void intFPlist(List<Integer> list) {
        list.stream().forEach(item-> System.out.println(item));

    }
    private static void intFPlistFilteredE(List<Integer> list) {
        list.stream().filter(item -> item % 2 == 0)
                .forEach(item -> System.out.println("Even numbers "+item));

    }
    private static void intFPlistFilteredO(List<Integer> list){
        list.stream().filter(item->item %2 !=0)
                .forEach(item-> System.out.println("Odd numbers "+ item));
    }



}
