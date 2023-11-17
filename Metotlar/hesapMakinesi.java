import java.util.Scanner;

public class hesapMakinesi {
    static int sum(int a, int b) {
        return a + b;
    }
    static int min(int a, int b) {
        return a-b;
    }
    static int times(int a, int b) {
        return a*b;
    }
    static double div(double a, double b) {
        return a/b;
    }
    static int pow (int a, int b) {
        int toplam = 1;
        for(int i = 1; i<=b; i++) {
            toplam *=a;
        }
        return toplam;
    }
    static int mod(int a, int b) {
        return a % b;
    }
    static int alan(int a, int b) {
        int alan = a * b;
        return alan;
    }
    static int cevre(int a, int b) {
        int cevRe = a * b;
        return cevRe;
    }
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        
        

        String menu = "1- Toplama İşlemi\n"
                    + "2- Çıkarma İşlemi\n"
                    + "3- Çarpma İşlemi\n"
                    + "4- Bölme İşlemi\n"
                    + "5- Üslü sayı hesaplama\n"
                    + "6- Mod Alma İşlemi\n"
                    + "7- Dikdörtgen Alan ve Çevre Hesabı\n"
                    + "8- Çıkış Yap";
                    System.out.println(menu);

                   while(true) {
                        System.out.println("Bir işlem seçiniz : ");
                        select = scan.nextInt();
                        if(select == 0 || select >=8) {
                            System.out.println("Hatalı bir tuşlama yaptınız uygulamadan çıkılıyor...");
                            break;
                        }
                        System.out.println("Lütfen işlem yapmak istediğiniz sayıları giriniz");
                        int a = scan.nextInt();
                        int b = scan.nextInt();
                        switch (select) {
                            case 1: 
                            System.out.println("Toplam Değeriniz : " + sum(a,b));
                            break;    
                            case 2:
                            System.out.println("Sonuç : " + min(a,b));
                            break;
                            case 3:
                            System.out.println("Çarpma Sonucu : " + times(a,b));
                            break;
                            case 4:
                            System.out.println("Bölüm Sonucu : " + div(a,b));
                            break;
                            case 5: 
                            System.out.println("A sayısının B üssü : " + pow(a, b));
                            break;
                            case 6:
                            System.out.println("A sayısının B ile bölümünden kalan = " + mod(a, b));
                            break;
                            case 7:
                            System.out.println("Diktörtgenin alanını çağırmak istiyorsanız -1-'e basın. Diktörtgenin Çevresini hesaplamak istiyorsanız -2-'ye basın");
                            int select2 = scan.nextInt();
                            switch(select2) {
                                case 1: System.out.println("Dikdörtgenin Alanı : " + alan(a,b));
                                break;
                                case 2: System.out.println("Dikdörtgenin Çevresi : " + cevre(a,b));
                                break;
                                default: System.out.println("Lütfen geçerli bir değer giriniz!");
                            }
                            default: System.out.println("Lütfen geçerli bir değer giriniz:");
                        }
                    }
    }
}
