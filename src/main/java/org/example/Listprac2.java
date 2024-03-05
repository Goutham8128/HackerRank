package org.example;

import java.util.*;

public class Listprac2 {
    public static void main(String[] args){
        System.out.println("");
        List<String> list1=List.of("Goutham","Ravi","Bhanu","ChandraBabu");
        List<String> list2=List.of("Teja","Kiran","Rahul","Tarun");
        List<String> list3=List.of("Amazon","Walmart","Chewy");


        List<String> linkedList= new LinkedList<String>(list1);
        List<String> arrayList= new ArrayList<String>(list2);
        List<String> vector= new ArrayList<String>(list3);

        linkedList.addAll(arrayList);
        System.out.println(linkedList);
        linkedList.addAll(vector);
        System.out.println(linkedList);


        for(String word:arrayList){
            if(word.endsWith("ul")) {
                arrayList.remove(word);
            }
        }
        System.out.println(arrayList);




    }
}
