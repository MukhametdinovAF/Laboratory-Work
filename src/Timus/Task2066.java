package Timus;

import java.util.Scanner;
public class Task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int var=0;
        if(a==b&a==0||a==b&a==1) {
            var=a-b;
            System.out.println(var-c);
        }
        else if (a==0&b==1) {
            var=a-b;
            System.out.println(var-c);
        }
        else System.out.println(a-b*c);
    }
}



