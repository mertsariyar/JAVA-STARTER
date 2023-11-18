import java.util.Scanner;

public class test10 {
    static void f(int a) {
        if(a <= 0) {
            System.out.println("Son Değer : "  + a);
        }else {
            System.out.println("Çıkarma " + a);
            f(a-5);
            System.out.println("Ekleme " + a);
        }
    }
    public static void main(String[] args) {
        System.out.println("Lütfen sayınızı giriniz ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        f(a);
    }
}
