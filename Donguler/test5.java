package Donguler;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //Önce kullanıcıdan bir değer aldık
        //Bu aldığımız değerin sadece tek sayılarını gösterdik
        //Bu tek sayıların toplamını bulduk


        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        int d = 0;
        while(i>=1) {
            
            i--;
            if(i%2==1) {
                System.out.println(i);
                d = i + d;
            }
        }
        System.out.println("Toplam değer : " + d);
    }
    
}
