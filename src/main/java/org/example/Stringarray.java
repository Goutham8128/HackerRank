package org.example;

import java.util.Arrays;

public class Stringarray {
    public static  void main(String[] args) {
        System.out.println("");
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


        String dayWithMostCharacters="";
        for(String day: days){
            if(day.length()>dayWithMostCharacters.length()){
                dayWithMostCharacters=day;
            }
        }
        System.out.println("Day with max length is: "+ dayWithMostCharacters +"and length is: "+dayWithMostCharacters.length() );
        for(int i= days.length-1;i>=0;i--){
            System.out.println(days[i]);
        }
       // System.out.println(Arrays.toString(days));

    }
}
