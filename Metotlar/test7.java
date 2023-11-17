import java.util.Scanner;

public class test7 {


    static boolean isPalindrom(int n) {
        int temp = n, reverseNumber = 0, lastNumber;
        while(temp !=0) {

            System.out.println("------------");
            System.out.println("Sayi = " + temp);
            lastNumber = temp % 10;
            System.out.println("Son Basamak >  " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni Sayı > " + reverseNumber);
            temp /=10;
        }
        if(reverseNumber == n) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        System.out.println(isPalindrom(7007));
       
    }
}
