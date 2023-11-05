import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        int month, day; 
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı giriniz (sayıyla) : ");
        month = input.nextInt();
        System.out.println("Lütfen doğduğunuz günü giriniz : ");
        day = input.nextInt();

        switch(month) {

            case 1: 
            if(day <= 22) {
                System.out.println("Oğlak Burcu");
            }else{
                System.out.println("Kova Burcu");
            }
            break;
            case 2:
            if(day <=19) {
                System.out.println("Kova Burcu");
            }else {
                System.out.println("Balık Burcu");
            }
            break;
            case 3:
            if(day >= 21) {
                System.out.println("Koç Burcu");
            }else {
                System.out.println("Balık Burcu");
            }
            break;
            case 4: 
            if(day <=20) {
                System.out.println("Koç Burcu");
            }else {
                System.out.println("Boğa Burcu");
            }
            break;
            case 5:
            if(day >= 21) {
                System.out.println("İkizler Burcu");
            }else {
                System.out.println("Balık Burcu");
            }
            break;
            case 6:
            if(day >= 22) {
                System.out.println("Yengeç Burcu");
            }else {
                System.out.println("İkizler Burcu");
            }
            break;
            case 7:
            if(day >=23) {
                System.out.println("Aslan Burcu");
            }else {
                System.out.println("Yengeç Burcu");
            }
            break;
            case 8:
            if(day >=24) {
                System.out.println("Başak Burcu");
            }
            else{
                System.out.println("Aslan Burcu");
            }
            break;
            case 9:
            if(day >= 24) {
                System.out.println("Terazi Burcu");
            }else {
                System.out.println("Başak Burcu");
            }
            break;
            case 10:
            if(day >= 24) {
                System.out.println("Akrep Burcu");
            }else {
                System.out.println("Terazi");
            }
            break;
            case 11:
            if(day >= 24) {
                System.out.println("mal Burcu");
            }else {
                System.out.println("Sks");
            }
            break;
            case 12:
            if(day >= 24) {
                System.out.println("HEY");
            }
            else {
                System.out.println("dude");
            }
            break;
            default:
            System.out.println("Hatalı bir değer girdiniz!");
        }
        
    }
}
