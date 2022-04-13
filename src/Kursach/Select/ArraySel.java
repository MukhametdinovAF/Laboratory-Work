package Kursach.Select;

import Kursach.Insert.ArrayIns;

import java.util.Random;

public class ArraySel {
    private long[] array; // Ссылка на массив a
    private int length; // Количество элементов данных

    public ArraySel(int max) // Конструктор
    {
        array = new long[max]; // Создание массива
       length = 0; // Пока нет ни одного элемента
    }

    public void randomInsert(int value, ArraySel arr){ // Метод, позволяющий заполнить массив случайными значениями
        Random random = new Random();
        length=value;
        for (int i=0;i<value;i++){
            array[i]=random.nextInt(value);
        }
    }

    public void insert(long value) // Вставка элемента в массив
    {
        array[length] = value; // Собственно вставка
        length++; // Увеличение размера
    }

    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<length; j++) // Для каждого элемента
            System.out.print(array[j] + " "); // Вывод
        System.out.println("");
    }

    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<length-1; out++) // Внешний цикл
        {
            min = out; // Минимум
            for(in=out+1; in<length; in++) // Внутренний цикл
                if(array[in] < array[min] ) // Если значение min больше,
                    min = in; // значит, найден новый минимум
            swap(out, min); // swap them
        }
    }

    private void swap(int one, int two)
    {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}

