package Donguler;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        while(i>=1) {
            i--;
            if(i%i-1==0) {
                System.out.println(i);
            }
        }
    }
}
