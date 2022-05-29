package Timus;

import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] array = new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=in.nextInt();
        }
        int maxPower=0;
        int maxNumber=0;
        int i=0;
        int sum=0;
        while (i<=n-3){
            sum=array[i]+array[i+1]+array[i+2];
            if (sum>maxPower){
                maxPower=sum;
                maxNumber=i+2;

            }
            i+=1;
        }
        System.out.println(maxPower+" "+maxNumber);
    }
}
