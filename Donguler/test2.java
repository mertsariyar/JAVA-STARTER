package Donguler;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passWord = "12345";
        boolean passWordSuccessfull = false;

        while(!passWordSuccessfull) {
            System.out.println("Lütfen şifrenizi giriniz!");
            String typedPassword = input.next();

            if(passWord.contentEquals(typedPassword)) {
                passWordSuccessfull = true;
                System.out.println("Sisteme giriş yaptınız!");
            }else {
                System.out.println("Lütfen geçerli bir şifre giriniz!");
            }
        }
    }
}
