package org.example;

import java.util.ArrayList;

public class MyCustomList<T> {
    ArrayList<T> list=new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }

    public void removeElement(T element){
        list.remove(element);
    }

    @Override
    public String toString() {
        return "MyCustomList{" +
                "list=" + list +
                '}';
    }
}
