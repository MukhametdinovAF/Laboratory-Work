package Programming.laba3.hometask6;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int a = scn.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            if (i % 5 == 2) {
                array[i] = i;
                System.out.println(array[i]);
            }
        }
    }
}
