package Programming.laba9.task2.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExceptions array1 = new ArrayExceptions();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int ArrayLength = 0;
        try {
            ArrayLength = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Используйте положительные целые числа для размера массива!");
        }
        try{
        array1.GetNewArray(ArrayLength);
        }catch (NegativeArraySizeException e) {
            System.out.print("Ошибка! Введите корректный размер массива!");
        }catch (ArithmeticException e){
            System.out.print("Ошибка! Вы ввели неверный размер массива, что вызвало вероятность деления на ноль! ");
        }
    }
}
