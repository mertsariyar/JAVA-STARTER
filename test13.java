import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayı: ");
        a = input.nextInt();
        System.out.println("İkinci Sayı");
        b = input.nextInt();
        System.out.println("Üçüncü Sayı");
        c = input.nextInt();

        if(!(a == b) && !(a == c) && !(b == c)) {
            
        if((a>b) && (a>c)) {
            if(a>b) {
                System.out.println("a > b > c");
            }else {
                System.out.println("a > c > b");
            }
        }else if((b>a) && (b>c)) {
            if(b>a) {
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }
        }else if((c>a) && (c>b)){
            if(c>a) {
                System.out.println("c > a > b");
            }else {
                System.out.println("c > b > a");
            }
        }
        }else {
            System.out.println("Lütfen eşit olmayan bir değer giriniz!");
        }
      
     

          }


    }

    
