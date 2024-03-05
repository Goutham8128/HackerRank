package org.example;

import java.util.List;

public class FunctionalProgram {
    public static void main(String[] args){
        System.out.println("");

        List<String> list=List.of("Apple","banana","kiwi");

        printBasic(list);
        printwithFPwithFiltering(list);
    }

    private static void printBasic(List<String> list) {
        for(String iterator: list) {
            System.out.println(iterator);
        }

    }
    private static void printwithFP(List<String> list) {
       list.stream().forEach(
               element-> System.out.println(element));
    }

    private static void printwithFPwithFiltering(List<String> list) {
        list.stream()
                .filter(element-> element.endsWith("le"))
                .forEach(element-> System.out.println("element-"+ element));

    }

}
