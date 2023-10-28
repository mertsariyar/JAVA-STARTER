import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextInt();
        double alan = (radius*radius) * 3.14;
        double cevre = (3.14 * 2) * radius;

        System.out.println("Dairenizin alanı : " + alan);
        System.out.println("Dairenizin çevresi : " + cevre);
    }
}
