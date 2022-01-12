package Programming.laba3.hometask5;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте размер массива");
        int a = scanner.nextInt();
        int[] array=new int[a];
        int sum = 0;
        System.out.println("Теперь программа проверит и выведет какие из чисел делятся на:");
        System.out.println("1)5 с остатком 2");
        System.out.println("2)3 с остаткоь 1");
        for (int i=0;i< array.length;i++){
            if (i%5==2){
                array[i]=i;
                System.out.println(array[i]);
            }
            else if (i%3==1){
                array[i]=i;
                System.out.println(array[i]);
            }
        }
        for(int j:array){
            sum+= j;
        }
        System.out.println("Сумма элементов массива, удовлетворяющих условиям равна "+sum);
    }
}
