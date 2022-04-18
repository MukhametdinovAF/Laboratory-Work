package CourseWork.Insert;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

public class ArrayIns {
    private long[] array; // Ссылка на массив a
    private int length; // Количество элементов данных

    public ArrayIns(int max) // Конструктор
    {
        array = new long[max]; // Создание массива
        length = 0; // Пока нет ни одного элемента
    }

    public void randomInsert(int value, ArrayIns arr){ // Метод, позволяющий заполнить массив случайными значениями
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

    public void insertionSort()
    {
        int in, out;
        for(out=1; out<length; out++) // out - разделительный маркер
        {
            long temp = array[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && array[in-1] >= temp) // Пока не найден меньший элемент
            {
                array[in] = array[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            array[in] = temp; // Вставить помеченный элемент
        }
    }
    public void WriteToTxtUnsorted() {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\CourseWork\\FinalSorting\\Result",false)))) {
            writer.write("Массив до сортировки:");
            writer.write("\n");
            for (int i = 0; i < length; i++) {
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void WriteToTxtSorted(){
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\CourseWork\\FinalSorting\\Result",true)))){
            writer.write("\nМассив после сортировки:");
            writer.write("\n");
            for (int i =0;i<length;i++){
                writer.write(String.valueOf(array[i]));
                writer.write(" ");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

} // Конец класса ArrayIns

