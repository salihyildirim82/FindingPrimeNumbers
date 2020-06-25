package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        int count = 0;
        if (number < 2) {
            System.out.println("The number you entered is not the prime number. Because the smallest prime number is 2.");
        } else {
            for (int i = 1; i <= number; i++) {
                int kalan = number % i;
                if (kalan == 0) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("The number you enter is a prime number.");
        } else {
            System.out.println("The number you entered is not a prime number.");
        }
    }
}
