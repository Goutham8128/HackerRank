package org.example;

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args){
        MyCustomList<String> customList1 = new MyCustomList();

        customList1.addElement("Element1");
        customList1.addElement("Element2");

        MyCustomList<Integer> customList2=new MyCustomList();
        customList2.addElement(4);
        customList2.addElement(5);

        System.out.println(customList2);
        System.out.println(customList1);


    }
}
