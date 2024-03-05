package org.example;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Settype1 {
    public static void main(String[] args){
        System.out.println("");
        List<Character> characterlist= List.of('a','b','d','e','f','e','f','z');
        Set<Character> treeset= new TreeSet<>(characterlist);
        System.out.println(treeset);

    }
}
