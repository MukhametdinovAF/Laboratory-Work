package CourseWork.Bubble;

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
        arr.display(); // Вывод элементов
        arr.bubbleSort(); // Пузырьковая сортировка элементов
        arr.display(); // Повторный вывод
        Instant finish = Instant.now();
        long elapsed= Duration.between(start,finish).toMillis();
        System.out.println("Время работы программы: "+elapsed+" миллисекунд");
    } //
} // Конец класса BubbleSortApp

