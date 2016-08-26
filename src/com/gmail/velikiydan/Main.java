package com.gmail.velikiydan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please,enter a number,so we can find prime numbers: ");
        int limit = sc.nextInt();
        boolean isPrime[] = new boolean[limit]; //isPrime[0] is 1, isPrime[1] is 2 ... isPrime[limit-1] is limit.
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 1; i < Math.sqrt(limit); i++) {
            if (isPrime[i])
                for (int j = (i + 1) * (i + 1); j <= limit; j += (i + 1)) {
                    isPrime[j - 1] = false;
                }
        }

        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i])
                System.out.print((i + 1) + " ");
        }

        sc.close();
    }
}
