package Timus;

import java.util.Scanner;

public class Task1225 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1||n==2) {
            System.out.println("2");
        } else {
            int[] a = new int[n];
            a[0]=2;
            a[1]=2;
            a[2]=4;
            for (int i = 3; i < n; i++) {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.println(a[n-1]);
        }
    }
}

