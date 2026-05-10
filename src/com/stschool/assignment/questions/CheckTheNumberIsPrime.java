package com.stschool.assignment.questions;

import java.util.Scanner;

public class CheckTheNumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to Check it is a Prime Number or not  : ");
        int num = sc.nextInt();


        if (num <= 1){
            if (num % 2 == 0){
                System.out.println(num + "is a prime number");
            }else {
                System.out.println(num + "is not a prime number" );
            }
        }
    }
}
