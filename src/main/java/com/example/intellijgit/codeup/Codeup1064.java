package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        long num3 = sc.nextLong();

        System.out.println(num1 > num2 ? (num2 > num3 ? num3 : num2) : (num1 > num3 ? num3 : num1));
    }
}