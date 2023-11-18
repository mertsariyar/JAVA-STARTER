import java.util.Scanner;

public class test9 {

    static boolean asalKontrol (int a, int bolen) {
        if(bolen == 1) {
            return true;
        }else {
            if(a % bolen == 0) {
                return false;
            }else {
                return asalKontrol(a, bolen - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Asal sayı kontrol = ");
        int a = input.nextInt();

        if(a < 2) {
            System.out.println("Asal sayı değildir");
        }else {
            if(asalKontrol(a, a / 2)) {
                System.out.println("Asaldır " + a);
            }else {
                System.out.println("Asal değildir" + a);
            }
        }

    }
}
