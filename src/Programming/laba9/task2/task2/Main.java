package Programming.laba9.task2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int i = in.nextInt();
        MatrixExceptions matrix1 = new MatrixExceptions();
        matrix1.GetNewMatrix(i);
    }
}
