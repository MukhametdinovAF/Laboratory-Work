package Programming.laba4.hometask4;

import java.util.Scanner;
public class Example4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int[][] array = new int[x][x];
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            for (j = 0; j<=i; j++) {
                array[i][j] = 1;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
