package Donguler;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, passWord;
        int right = 3;
        int balance = 1500;
        int select;
        int tutar;
        int cekilecekTutar;

        while(right > 0) {
            System.out.println("Lütfen kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.println("Lütfen Şifrenizi Giriniz:");
            passWord = input.nextLine();
            if(userName.equals("a") && passWord.equals("b")) {
               do{
                System.out.println("Tebrikler kullanıcı adı ve parolanız doğru.. sisteme giriş yapıyorsunuz.");
                System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçin: ");
                System.out.println("1-Para yatırma\n" +
                "2-Para Çekme\n" +
                "3-Bakiye Sorgula\n" +
                "4-Çıkış Yap");
                select = input.nextInt();
                switch(select) {
                    case 1: System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                    tutar = input.nextInt();
                    System.out.println("Girilen Tutar " + tutar);
                    balance += tutar;
                    System.out.println("Bakiyeniz " + balance);
                    break;
                    case 2: System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                    cekilecekTutar = input.nextInt();
                    if(cekilecekTutar <= balance) {
                        balance -= cekilecekTutar;
                        System.out.println("Çektiğiniz tutar : " + cekilecekTutar + " Kalan Bakiyeniz " + balance);
                    }else {
                        System.out.println("Girdiğiniz tutar bakiyenizden yüksek olamaz.");
                    }
                    break;
                    case 3: System.out.println("Bakiyeniz : " + balance);
                    break;
                }
               }while(select!=4); 
               break;
            }else {
                right--;
                System.out.println("Girdiğiniz şifre yanlış! Kalan hakkınız : " + right); 
                if(right == 0) {
                    System.out.println("Birçok yanlış deneme yaptınız... Lütfen tekrar dene amk.!");
                }
            }
        }


    }
}
