package Programming.laba2.hometask1;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = scn.nextInt();
        int b=a%3;
        int c=a/3;
        if (b>0){
            System.out.println("Число не делится на 3. Попробуй другое! ");
        }
        else {
            System.out.print("Отлично! Это число делится на 3!");
            System.out.println(" Вот результат "+c);
        }
    }
}
