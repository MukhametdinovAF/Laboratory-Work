package Programming.laba1.hometask16;

import java.util.Scanner;

public class Example16 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        int b = (a+1);
        int c = (a-1);
        int d = (a+b+c);
        int e = (d*d);
        System.out.printf("%s,%s,%s,%s",c,a,b,e);
    }
}
