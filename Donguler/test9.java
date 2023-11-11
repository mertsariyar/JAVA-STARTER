package Donguler;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int total = 1;


        for(int i = 1; i<=a; i++) {
            total = total * i;
            System.out.println(total);
        } 
    }
}
