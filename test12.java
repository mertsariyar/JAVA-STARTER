import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Scaıklık Giriniz :");
        heat = input.nextInt();

        if(heat < 5) {
            System.out.println("Sıcaklık Değeri : " + heat + " Bu sıcaklık değerleriyle kayak yapabilirsiniz!");
        }else if(heat >= 5 && heat <15) {
            System.out.println("Sinema");
        }else if(heat >= 15 && heat < 25) {
            System.out.println("Piknik");
        }else if(heat > 25) {
            System.out.println("Git yüz");
        }
    }
}
