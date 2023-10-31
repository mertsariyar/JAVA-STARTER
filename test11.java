import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,turkce,fizik,kimya;

        System.out.print("Matematik Puanınızı Giriniz : ");
        mat = input.nextInt();
        System.out.print("Türkçe Puanınızı Giriniz: ");
        turkce = input.nextInt();
        System.out.print("Fizik puanınızı giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya puanınızı giriniz : ");
        kimya = input.nextInt();

        double avarage = (mat+turkce+fizik+kimya) / 4;

        if (avarage >= 55) {
            System.out.println("Sınavı Geçtiniz ");
        }else {
            System.out.println("Sınavdan kaldınız.");
        }

    }
}
