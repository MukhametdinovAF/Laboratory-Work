package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1493 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 0;
        value = in.nextInt();
        int valueNext=value+1;
        int valuePrev=value-1;
        

//        List<Integer> integersNext = new ArrayList<>();
//        while (valueNext != 0) {
//            integersNext.add(value % 10);
//            value /= 10;
//        }
//        List<Integer> integersPrev = new ArrayList<>();
//        while (valuePrev != 0) {
//            integersPrev.add(value % 10);
//            value /= 10;
//        }
//
//        List<Integer> integersLeftNext = new ArrayList<>();
//        for (int i = 5; i > 2; i--) {
//            integersLeftNext.add(integersNext.get(i));
//        }
//        List <Integer>integersRightNext=new ArrayList<>();
//        for(int i=2;i>=0;i--){
//            integersRightNext.add(integersNext.get(i));
//        }
//        List<Integer> integersLeftPrev = new ArrayList<>();
//        for (int i = 5; i > 2; i--) {
//            integersLeftPrev.add(integersPrev.get(i));
//        }
//        List <Integer>integersRightPrev=new ArrayList<>();
//        for(int i=2;i>=0;i--){
//            integersRightPrev.add(integersPrev.get(i));
//        }
//
//        int sumLeftNext=0;
//        int sumLeftPrev=0;
//        int sumRightNext=0;
//        int sumRightPrev=0;
//        for(int i:integersLeftNext){
//            sumLeftNext+=i;
//        }
//        for(int i:integersRightNext){
//            sumRightNext+=i;
//        }
//        for(int i:integersLeftPrev){
//            sumLeftPrev+=i;
//        }
//        for(int i:integersRightPrev){
//            sumRightPrev+=i;
//        }
//        if(sumLeftNext==sumRightNext||sumLeftPrev==sumRightPrev){
//            System.out.println("Yes");
//        }
//        else System.out.println("No");
    }
}
