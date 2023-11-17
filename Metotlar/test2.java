import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String b = "";
        do {
            b += a%2;
            a = a/2;
        }while(a!=0);

        b = new StringBuilder(b).reverse().toString();
        System.out.println(b);
    }
}
