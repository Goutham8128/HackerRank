package org.example;

import java.util.List;

public class FuncProg {
    public static void main(String[] args){
        System.out.println("");
        List<String> list = List.of("Apple","orange","kiwi");
        basicWithFP(list);
        //basic(list);
    }

    public static void basic(List<String> list) {
        for(String str: list){
            System.out.println(str);
        }
    }

    public static void basicWithFP(List<String> list) {
        list.stream()
                .filter(element->element.endsWith("e"))
                .forEach(
                element->System.out.println(element)
        );
    }
}
