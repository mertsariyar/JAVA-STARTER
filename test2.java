import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the price you have.");
        price = input.nextDouble();
        double kdv = 0.18;
        double priceWithKdv = (kdv * price) + price;
        double showKdvRate = kdv*price;

        System.out.println("Price with KDV included " + priceWithKdv);
        System.out.println("KDV rate :" + showKdvRate);

    }
}
