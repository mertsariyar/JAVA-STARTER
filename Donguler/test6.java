package Donguler;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i;
        int sum = 0;
        do {
            System.out.println("Lütfen değer giriniz");
            i = input.nextInt();
            if(i%2==1) {
                sum +=i;
            }
        }while(i>0);
        System.out.println("Girilen tek sayıların toplam değeri: " + sum);
    }


    
}
