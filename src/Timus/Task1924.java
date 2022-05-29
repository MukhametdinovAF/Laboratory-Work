package Timus;

import java.util.Scanner;

public class Task1924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int resuilt =1;
        for(int i=1;i<n;i++){
            if(i%2!=0){
                resuilt+=(i+1);
            }
            else resuilt-=(i+1);
        }
        if(resuilt%2==0){
            System.out.println("black");
        }
        else System.out.println("grimy");
    }
}
