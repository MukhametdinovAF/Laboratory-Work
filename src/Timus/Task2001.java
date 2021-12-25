package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int berryWeight2 = b1-b2;
        int berryWeight1 = b3-berryWeight2-b2;
        System.out.println(berryWeight1+" "+berryWeight2);
    }
}

