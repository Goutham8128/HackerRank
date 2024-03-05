package org.example;

import java.util.List;

public class MethodReferences {
    public static void main(String[] args){
        System.out.println("");

        List<String> antList=List.of("ant","mosquito","butterfly");
        List<Integer> intList=List.of(12,34,35,66,75);


        referencePrac(antList);
        referencePrac2(antList);
        referencePrac3(antList);
    }

    public static void MethodRefRunner(Integer number){
        System.out.println(number);
    }

    public static void MethodRefRunner1(String str){
       System.out.println(str);
    }

    public static void referencePrac(List<String> antList) {
        antList.stream().map(l->l.length()).forEach(a-> System.out.println(a));
    }
    public static void maxReference(List<Integer> intList){
        intList.stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1,n2)).orElse(0);
    }

    public static void referencePrac2(List<String> antList) {
        antList.stream().map(String::length).forEach(MethodReferences::MethodRefRunner);
    }

    public static void referencePrac3(List<String> antList){
        antList.stream().filter(e->e.endsWith("o")).forEach(MethodReferences::MethodRefRunner1);
    }

}
