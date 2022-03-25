package Programming.laba9.task2.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayExceptions array1 = new ArrayExceptions();
        // создание сканнера для ввода размера массива с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int ArrayLength = 0;
        // блок try проверяющий выделенный код на возникновение ошибок, связанных с неверным вводом данных
        try {
            ArrayLength = in.nextInt();
        }
        // тип ошибок, которые перехватываются в блоке try
        catch (InputMismatchException e) {
            System.out.println("Ошибка! Используйте положительные целые числа для размера массива!");
        }
        // даже, при верном вводе данных, внутри кода могут возникнуть различные ошибки,
        // для этого вносим блок кода с обращением к методу в блок try и пытаемся отловить эти ошибки
        try{
        array1.GetNewArray(ArrayLength);
        }catch (NegativeArraySizeException e) {
            System.out.print("Ошибка! Введите корректный размер массива!");
        }catch (ArithmeticException e){
            System.out.print("Ошибка! Вы ввели неверный размер массива, что вызвало вероятность деления на ноль! ");
        }

    }
}
