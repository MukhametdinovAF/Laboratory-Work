package Programming.laba2.hometask10;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scn.nextInt();
        int b = a % 8;
        int c = a /8 % 8;
        int d = a /8 / 8 % 8;
        int e = a /8 / 8/ 8 % 8;
        int f = a /8 / 8/ 8 /8 % 8;
        System.out.println("Введенное число в восьмеричном виде будет выглядеть так: "+f+ +e+ +d+ +c+ +b+" Вторая цифра справа равна "+c);
    }
}