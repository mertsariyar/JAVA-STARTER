package Donguler;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz.");
        double n = input.nextInt();
        double result = 0;

        for(int i = 1; i<=n; i++) {
            result += (1/n);
            System.out.println(result);
        }
    }
}
