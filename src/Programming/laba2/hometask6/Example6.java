package Programming.laba2.hometask6;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scn.nextInt();
        int b=a%3;
        if(b==0){
                System.out.println("Число делится на 3");
        }
        else System.out.println("Число не делится на 3");
    }
}
