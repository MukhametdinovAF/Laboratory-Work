package Programming.laba1.hometask15;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input the first number:");
        int a = input.nextInt();
        System.out.print("Input the second number:");
        int b = input.nextInt();
        System.out.printf("Summa= ");
        System.out.println(a+b);
        input.close();
    }
}
