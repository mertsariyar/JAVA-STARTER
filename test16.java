import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğum yılınızı giriniz : ");
        int birtDate = input.nextInt();
        

        
        if(birtDate%12==0) {
            System.out.println("At burcusunuz!");
        }else if(birtDate%12==1) {
            System.out.println("Eşek Burcu");
        }
        else if(birtDate%12==2) {
            System.out.println("Eşek Burcu");
        }
        else if(birtDate%12==3) {
            System.out.println("Eşek Burcu");
        }
        else if(birtDate%12==4) {
            System.out.println("Eşek Burcu");
        }
        else if(birtDate%12==5) {
            System.out.println("Şeri Burcu");
        }
        else if(birtDate%12==6) {
            System.out.println("Deli Burcu");
        }
        else if(birtDate%12==7) {
            System.out.println("Yılan Burcu");
        }
        else if(birtDate%12==8) {
            System.out.println("Boğa Burcu");
        }
        else if(birtDate%12==9) {
            System.out.println("Keçi Burcu");
        }
        else if(birtDate%12==10) {
            System.out.println("Eşek Burcu");
        }
        else if(birtDate%12==11) {
            System.out.println("At Burcu");
        }


    }
}
