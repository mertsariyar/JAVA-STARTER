import java.util.Scanner;

public class test4 {

    static int faktorial(int a) {
        int toplam = 1;
        for(int i = 1; i<=a; i++) {
            toplam = toplam * i;
        }
        return toplam;
    }
    public static void main(String[] args) {
       
        System.out.println(faktorial(7));

    }
}
