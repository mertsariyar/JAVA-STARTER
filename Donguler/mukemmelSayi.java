package Donguler;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int toplam = 0;
        for(int i = 1; i<a; i++) {
            if(a%i==0) {
                toplam += i;
            }
        }


        if(a == toplam) {
            System.out.println("Bu sayı mükemmel sayıdır.");
        }else {
            System.out.println("Bu sayı mükemmel sayı değildir!");
        }
    }
}
