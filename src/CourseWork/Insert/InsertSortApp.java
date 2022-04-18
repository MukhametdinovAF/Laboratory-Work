package CourseWork.Insert;

import java.time.Duration;
import java.time.Instant;

public class InsertSortApp {
    public static void main(String[] args)
    {
        Instant start = Instant.now();
        int maxSize = 100000; // Размер массива
        ArrayIns arr; // Ссылка на массив
        arr = new ArrayIns(maxSize); // Создание массива
        arr.randomInsert(maxSize,arr);
        arr.display(); // Вывод элементов
        arr.insertionSort(); // Сортировка методом вставки
        arr.display(); // Повторный вывод
        Instant finish = Instant.now();
        long elapsed= Duration.between(start,finish).toMillis();
        System.out.println("Время работы программы: "+elapsed+" миллисекунд");
    }
}

