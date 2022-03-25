package Programming.laba9.task2.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        try {
        int i = in.nextInt();
        MatrixExceptions matrix1 = new MatrixExceptions();
        matrix1.GetNewMatrix(i);
        System.out.println("Введите номер столбца, который необходимо вывести ");
        int number = in.nextInt();
        matrix1.OutColumn(number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Введите правильный номер столбца!");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Вы ввели некорректные данные! ");
        }
    }
}
