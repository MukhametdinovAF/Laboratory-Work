package Timus;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] abc = new int[]{a, b, c};
        Arrays.sort(abc);
        int count;

        if (abc[0] == abc[1] && abc[0] == 1||abc[0]==0) {
           count = abc[0] - abc[1] - abc[2];

        } else count = abc[0] - abc[1] * abc[2];
        System.out.println(count);
    }}



