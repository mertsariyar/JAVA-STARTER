package Donguler;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); 
        int i = 1;

        while(i<n) {
            i*=2;
            System.out.println(i);
        }
    }
}
