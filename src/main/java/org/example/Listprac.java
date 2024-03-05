package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Listprac {
    public static void main(String[] args){
        System.out.println("");
        List<String> words=List.of("Apple","orange","kiwi");
        System.out.println(words);
        System.out.println(words.size());
        System.out.println(words.isEmpty());
        System.out.println(words.get(0));
        System.out.println(words.contains("Apple"));
        System.out.println(words.contains("fdsds"));
        System.out.println(words.indexOf("orange"));
        System.out.println(words.indexOf("dsdsd"));
        /*the above list is immutable*/
        /*In order to make it mutable, we need to ocnvert to array list, linkedlist, vector*/
        List<String> wordsArrayList= new ArrayList<String>(words); /*making the above words list a array list*/
        List<String> wordsLinkedList= new LinkedList<String>(words);
        List<String> wordsVector= new Vector<String>(words);
        wordsArrayList.add(2,"dog");
        System.out.println(wordsArrayList);
        List<String> newList=List.of("ggd","dsds","sds");
        List<String> newListLinkedList= new LinkedList<String>(newList);
        wordsArrayList.addAll(newListLinkedList);
        System.out.println(wordsArrayList);
        wordsArrayList.set(4,"FIsh");
        System.out.println(wordsArrayList);

    }
}
