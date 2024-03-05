package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInt {
    public static void main(String[] args){

        List<Integer> numbers= List.of(123,23,12,33,22);
        List<Integer> arrayList=new ArrayList<>(numbers);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
     }
}
