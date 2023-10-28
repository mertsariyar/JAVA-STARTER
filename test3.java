import java.util.Scanner;
public class test3 {

    public static void main(String[] args) {
        //Değişkenlerimizi oluşturalım
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz : ");
        b = input.nextInt();
        
        c = Math.sqrt((a*a) + (b*b)); 
        System.out.println("Hipotenüs " + c);

        //javadaki Math.sqrt sınıfı javada bir sayının kökünü almamızı sağlar.
    }
}
