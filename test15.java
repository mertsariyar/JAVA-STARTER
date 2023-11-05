import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        int km, age, justGoOrComeBack;
        Scanner input = new Scanner(System.in);
        System.out.println("Gideceğiniz km'yi girin: ");
        km = input.nextInt();
        System.out.println("Yaşınız: ");
        age = input.nextInt();
        System.out.println("Tek yönse 1- Gidiş Dönüşse 2'yi tuşlayın");
        justGoOrComeBack = input.nextInt();

        double normalPrice = (km * 0.10) * 0.10;
        double ageDiscount = normalPrice * 0.10;
        double priceWithDiscount = normalPrice - ageDiscount;
        double justGoOrComeBackDiscount = priceWithDiscount * 0.20;
        
        if(km >0 && age > 0 && age <= 120) {
            switch(justGoOrComeBack) {
                case 1: 
                System.out.println("İndirimli Tutar : " + priceWithDiscount + " TL!");
                break;
                case 2:
                System.out.println("Gidiş-Geliş Bonuslu İndirimi : " + justGoOrComeBackDiscount + " TL!");
                break;
                default:
                System.out.println("Yanlış bir değer girdiniz!");
            }
        }else {
            System.out.println("Yanlış bir değer girdiniz bir daha deneyin!");
        }

    }
}
