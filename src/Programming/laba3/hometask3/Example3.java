package Programming.laba3.hometask3;

import java.util.Scanner;

public class Example3 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое количество чисел в последователньости Фибоначчи");
        int fib = scanner.nextInt();
        int [] arr = new int[fib];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i< arr.length;++i){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println("Последовательность Фибоначчи для первых "+fib +" чисел:");
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
