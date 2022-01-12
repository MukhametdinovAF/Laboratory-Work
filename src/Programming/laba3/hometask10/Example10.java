package Programming.laba3.hometask10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        System.out.println("Размер массива равен "+size);
        Integer [] numbers =new Integer[size];
        Random random = new Random();
        for (int i=0;i< numbers.length;i++){
            numbers[i]= random.nextInt(200);
            System.out.println("Элемент массива ["+i+"] ="+numbers[i]);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Произведена сортировка массива");
        for (int i =0;i< numbers.length;i++){
            System.out.println("Элемент массива ["+i+"] после сортировки ="  + numbers[i]);
        }
    }
}
