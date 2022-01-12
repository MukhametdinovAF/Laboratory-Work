package Programming.laba1.hometask17;

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the first number:");
        int a = input.nextInt();
        System.out.print("Input the second number:");
        int b = input.nextInt();
        int c = a+b;
        int d = a-b;
        System.out.printf("Summa: %s, Raznost: %s", c,d);
    }
}
