package Donguler;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayınızı girin: ");
        int n = input.nextInt();
        boolean isPrime = true;
        for(int i = 3; i<n; i++) {
            if(n%i==0) {
                isPrime = false;
            }
        }
        
        if(isPrime == true) {
            System.out.println("Girdiğiniz sayı bir asal sayıdır!");
        }else {
            System.out.println("Girdiğiniz sayı bir asal sayı değildir!");
        }
        
        }

        /*
         *  10 == 10 - 1 = 9 10 % 9 == 1
         * 10 % 8 == 0
         * 10 %7 == 0
         *
         */
    }
