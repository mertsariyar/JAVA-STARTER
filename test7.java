import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;

        System.out.println("Armutun kilosunu giriniz: ");
        armut = input.nextDouble();
        System.out.print("Elmanın kilosunu giriniz: ");
        elma = input.nextDouble();
        System.out.print("Domatesin kilosunu giriniz: ");
        domates = input.nextDouble();
        System.out.print("Muzun kilosunu giriniz: ");
        muz = input.nextDouble();
        System.out.print("Patlıcanın kilosunu giriniz: ");
        patlican = input.nextDouble();
        
        double armutPrice = armut * 2.14;
        double elmaPrice = elma * 3.67;
        double domatesPrice = domates * 1.11;
        double muzPrice = muz * 0.95;
        double patlicanPrice = patlican * 5;
        double toplam = (armutPrice + elmaPrice + domatesPrice + muzPrice + patlicanPrice);

        System.out.println("Armutun Kilosu " + armut + " Ödeyeceğiniz Tutar : " + armutPrice );
        System.out.println("Elmanın kilosu " + elma + " Ödeyeceğiniz Tutar : " + elmaPrice );
        System.out.println("domatesin kilosu " + domates + " Ödeyeceğiniz Tutar : " + domatesPrice );
        System.out.println("muzun kilosu " + muz + " Ödeyeceğiniz Tutar : " + muzPrice );
        System.out.println("patlıcanın kilosu " + patlican + " Ödeyeceğiniz Tutar : " + patlicanPrice );

        System.out.println("Toplam Ödeyeceğiniz Tutar : " + toplam);

    }
}
