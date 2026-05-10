package com.stschool.assignment.questions;
import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name to count the Vowels and Consonants : ");
        String input = sc.nextLine();
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        int i = 0;
        while (i < input.length()) {
            char cha = input.charAt(i);
            if (cha >= 'a' && cha <= 'z' ) {
                if (cha == 'a' || cha == 'e' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'i') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
i++;
        }
        System.out.println("Vowels in the Name are : " + vowels);
        System.out.println("Consonants in the Name are : " + consonants);
sc.close();
    }
}
