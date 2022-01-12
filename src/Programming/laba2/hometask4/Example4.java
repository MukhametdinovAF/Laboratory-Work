package Programming.laba2.hometask4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scn.nextInt();
        if (a <= 10) {
            if (a >= 5) {
                System.out.println("Число удовлетворяет условиям");
                System.out.println("Меньше или равно 10");
                System.out.println("Больше или равно 5");
            } else {
                System.out.println("Введите число больше 4");
            }
        } else {
            System.out.println("Число больше 10, введите число меньше");
        }
    }
}
