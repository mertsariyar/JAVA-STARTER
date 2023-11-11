package Donguler;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int password = 1234;

        boolean isTrue = true;

        do {
            System.out.println("Şifre Giriniz : ");
            password = input.nextInt();
            if(password == 1234) {
            System.out.println("Doğru");
            isTrue = false;
        }else {
            System.out.println("Yanlış");
        }
        }while(isTrue);
    }
}
