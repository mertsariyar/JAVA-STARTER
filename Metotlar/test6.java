import java.util.Scanner;

public class test6 {
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
         System.out.println(sayi);
           return sayi % 10 + basamaklarToplami(sayi / 10);
    }
    public static void main(String[] args){
        System.out.println("Basamak Sayısı  : " + basamaklarToplami(45612));
    }
    
}
