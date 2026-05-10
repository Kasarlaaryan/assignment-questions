package com.stschool.assignment.questions;

import java.util.Scanner;

public class factorial  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number to check it is an factorial : ");
        int num = sc.nextInt();
        int factorial = 1;
        int i = 1;
        if ( num < 0 ){
            System.out.println("Given Number is an negative number : " + num);
        }else {
            while (i <= num){
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial Number of  "+ num + "is :" + factorial);
        }
    }
}
