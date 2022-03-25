package Programming.laba9.task2.task3;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        try {
        byte length= in.nextByte();
        ArrayByteExceptions array1 = new ArrayByteExceptions();

            array1.GetByteArray(length);
        }
        catch(NoSuchElementException e){
            System.out.println("Ошибка! Сумма элементов массива превышает диапазон допустимых значений");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Ошибка! Вы ввели отрицательный размер массива!");
        }
    }
}
