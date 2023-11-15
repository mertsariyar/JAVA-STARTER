package Donguler;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.println("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        
        for(int i = n1; i >= 1; i--) {
            if(n1%i==0 && i%n2==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
