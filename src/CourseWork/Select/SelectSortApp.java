package CourseWork.Select;

import java.time.Duration;
import java.time.Instant;

public class SelectSortApp {
    public static void main(String[] args)
    {
        Instant start = Instant.now();
        int maxSize = 100000; // Размер массива
        ArraySel arr; // Ссылка на массив
        arr = new ArraySel(maxSize); // Создание массива
        arr.randomInsert(maxSize,arr);
        arr.display(); // Вывод элементов
        arr.selectionSort(); // Сортировка методом выбора
        arr.display(); // Повторный вывод
        Instant finish = Instant.now();
        long elapsed= Duration.between(start,finish).toMillis();
        System.out.println("Время работы программы: "+elapsed+" миллисекунд");
    }
} // Конец класса SelectSortApp

