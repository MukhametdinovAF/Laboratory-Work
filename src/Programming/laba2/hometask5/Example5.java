package Programming.laba2.hometask5;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scn.nextInt();
        int b=a/10;
        int c=a/10/10;
        int d=a/10/10/10;
        System.out.println("В числе "+d+" тысяч");
    }
}
