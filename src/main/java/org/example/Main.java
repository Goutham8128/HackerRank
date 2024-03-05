package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(3,1,2,1));
        int k = 4;
        List<List<Integer>> result = new ArrayList<>();
        int max = 0;
        for(int i=0;i<a.size();i++){
            List<Integer> result1 = new ArrayList<>();
            if(a.get(i)<=k) {
                result1.add(a.get(i));
            }
            result.add(result1);
        }
        for(int j=0;j<a.size()-1;j++){
            List<Integer> result2 = new ArrayList<>();
            if(a.get(j)+a.get(j+1)<=4) {
                result2.add(a.get(j));
                result2.add(a.get(j+1));
            }
            result.add(result2);
        }
        max = result.get(0).size();
        for(int s=0;s<result.size();s++){
            if(max<result.get(s).size()) max = result.get(s).size();
        }
        System.out.println(max);
    }
}