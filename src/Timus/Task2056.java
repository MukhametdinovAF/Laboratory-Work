package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int numbers;
        List <Integer> integers = new ArrayList<>();
        for(int i=0;i<n;i++){
            numbers=in.nextInt();
            integers.add(numbers);
        }
        int sum=0;
        int three=0;
        for(int i:integers){
            sum+=i;
            if(integers.contains(3)){
                three++;
            }
        }
        float middle = (float)sum/n;
        if(middle>=4.5&middle<5){
            System.out.println("High");
        }
        else if(middle==5){
            System.out.println("Named");
        }
        else if(three>0){
            System.out.println("None");
        }
        else System.out.println("Common");
    }
}
