import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();
        double sum = (km * 2.20) + 10;
        int haveTo = 20;

        if(sum <=20) {
            System.out.println("Ödemeniz gereken tutar : " + haveTo);
        }else {
             System.out.println("Ödemeniz gereken toplam tutar : " + sum);
        }
        
    }
}