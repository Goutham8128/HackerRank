package org.example;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        System.out.println("");
        try {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = {12, 3, 45, 6};
            int accobj = numbers[5];

            System.out.println("before scanner close");
            scanner.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        }


}
