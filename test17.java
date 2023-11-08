import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tarihi girin.");
        int date = input.nextInt();
        double theLeftWeHave = (date * 100);


        if(theLeftWeHave %400 ==0 &&  date %4 == 0) {
            System.out.println("Artık Yıldır");
        }else {
            System.out.println("Artık Yıldır");
        }
        
    }
}
