package com.example.intellijgit.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char ch = sc.next().charAt(0);
            System.out.println(ch);
            if(ch == 'q') break;
        }
    }
}
