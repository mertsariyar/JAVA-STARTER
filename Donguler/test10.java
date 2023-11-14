package Donguler;

import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı = ");
        int k = input.nextInt();
        System.out.println("üst Sayı : ");
        int u = input.nextInt();
        int total = 1;

        for(int i = 1; i<=u; i++) {
            total *= k;
            System.out.println(total);
        }

    }
}
