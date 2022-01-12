package Programming.laba2.hometask2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = scn.nextInt();
        int b=a%5;
        int c=a%7;
        if (b==2){
            if(c==1){
                System.out.println("Число делится на 5 с остатком 2 и на 7 с остатком 1");
            }
        }
        else {
            System.out.println("Число не удовлетворяет условиям:");
            System.out.println("Делится на 5 с остатком 2");
            System.out.println("Делится на 7 с остатком 1");
        }
    }
}
