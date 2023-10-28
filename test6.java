import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();
        double endeks = kilo / (height*height);
        System.out.println("Vücut kitle endeksiniz : " + endeks);
    }
}
