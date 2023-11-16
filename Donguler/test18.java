package Donguler;

import java.util.Scanner;

public class test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı giriniz.");
            return;
        }

        int girilenSayi;
        int enBuyuk = Integer.MIN_VALUE; // Başlangıçta en küçük değeri kullanıyoruz
        int enKucuk = Integer.MAX_VALUE; // Başlangıçta en büyük değeri kullanıyoruz

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi > enBuyuk) {
                enBuyuk = girilenSayi;
            }

            if (girilenSayi < enKucuk) {
                enKucuk = girilenSayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        scanner.close();
    }
}
