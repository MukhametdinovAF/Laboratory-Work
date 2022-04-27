package CourseWork.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class ArraySel {
    private long[] array; // Ссылка на массив a
    private int length; // Количество элементов данных

    public ArraySel(int max) // Конструктор
    {
        array = new long[max]; // Создание массива
        length = 0; // Пока нет ни одного элемента
    }
    public static void selectionSort(long[] array) {
        int out, in, min;
        for (out = 0; out < array.length - 1; out++) // Внешний цикл
        {
            min = out; // Минимум
            for (in = out + 1; in < array.length; in++)  // Внутренний цикл
                if (array[in] < array[min]) // Если значение min больше,
                    min = in;// значит, найден новый минимум
            long temp = array[out];
            array[out] = array[min];
            array[min] = temp;

        }
    }

    public static void WriteToTxtUnsorted(long[]array) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory-Work\\src\\CourseWork\\test\\Result", false)))) {
            writer.write("\n"+" ");
            writer.write("Массив до сортировки:");
            writer.write("\n"+" ");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void WriteToTxtSorted(long[]array) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory-Work\\src\\CourseWork\\test\\Result", true)))) {
            writer.write("\n"+" ");
            writer.write("\nМассив после сортировки:");
            writer.write("\n"+" ");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


