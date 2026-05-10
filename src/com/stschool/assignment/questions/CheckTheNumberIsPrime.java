package com.stschool.assignment.questions;

import java.util.Scanner;

public class CheckTheNumberIsPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to Check it is a Prime Number or not : ");

        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {

            isPrime = false;

        } else {

            int i = 2;

            while (i < num) {

                if (num % i == 0) {

                    isPrime = false;

                    break;
                }

                i++;
            }
        }

        if (isPrime) {

            System.out.println(num + " is a Prime Number");

        } else {

            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}