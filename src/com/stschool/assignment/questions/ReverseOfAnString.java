package com.stschool.assignment.questions;

import java.util.Scanner;

import static java.lang.System.*;

public class ReverseOfAnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Please Enter the Name to Print Reverse : ");
        String input = sc.nextLine();

        String reversed = "";
        //while loop;
        int i = input.length() - 1;
        while ( i >=0){
            reversed += input.charAt(i);
            i--;
        }


        //for loop ;
//        for (int i = input.length()-1;  i >= 0; i --){
//            reversed += input.charAt(i);
//        }

        System.out.println("Reversed String is : " + reversed);
        sc.close();

    }
}
