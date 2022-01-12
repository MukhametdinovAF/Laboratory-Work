package Programming.laba3.hometask4;

import java.util.Scanner;

public class Example4 {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scn.nextInt();
        System.out.println("Введите второе число");
        int num2 = scn.nextInt();
        if (num1>num2){
            int n = (num1-num2)+1;
            int [] arr = new int[n];
            for(int i = 0;i< arr.length;i++){
                arr[i]=num2+i;
                System.out.println(arr[i]);
            }
        }else{
            int m = (num2-num1)+1;
            int [] arr = new int[m];
            for(int i=0;i< arr.length;i++){
                arr[i]=num1+i;
                System.out.println(arr[i]);
            }
        }
    }
}
