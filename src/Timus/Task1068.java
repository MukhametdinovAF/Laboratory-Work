package Timus;

import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        if (n>0){
            for(int i=1;i<=n;i++){
                sum+=i;
            }
        }
        else {
            for(int i=n;i<2;i++){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
