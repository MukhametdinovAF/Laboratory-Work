package Programming.laba2.hometask3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scn.nextInt();
        int b=a%4;
        if (a>=10){
            if (b==0){
                System.out.println("Число удовлетворяет условиям");
                System.out.println("Не меньше 10");
                System.out.println("Делится на 4");
            }
            else {
                System.out.println("Число не подходит, так как не делится на 4");
            }
        }
        else {
            System.out.println("Число не подходит, так как нужно ввести число не меньше 10");
        }
    }
}
