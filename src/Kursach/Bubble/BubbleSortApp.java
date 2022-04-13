package Kursach.Bubble;

import java.time.Duration;
import java.time.Instant;

public class BubbleSortApp {
    public static void main(String[] args)
    {
        Instant start = Instant.now();
        int maxSize = 100000; // Размер массива
        ArrayBub arr; // Ссылка на массив
        arr = new ArrayBub(maxSize); // Создание массива
       arr.randomInsert(maxSize,arr);
//        arr.insert(77); // Вставка 10 элементов
//        arr.insert(99);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(00);
//        arr.insert(66);
//        arr.insert(33);
        arr.display(); // Вывод элементов
        arr.bubbleSort(); // Пузырьковая сортировка элементов
        arr.display(); // Повторный вывод
        Instant finish = Instant.now();
        long elapsed= Duration.between(start,finish).toMillis();
        System.out.println("Время работы программы: "+elapsed+" миллисекунд");
    } //
} // Конец класса BubbleSortApp

