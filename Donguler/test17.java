package Donguler;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for(int i = 1; i<=10; i++) {
            int c = i * a;
            
            System.out.println(a + " * " + i  + " = " + c);
        }
    }
}
