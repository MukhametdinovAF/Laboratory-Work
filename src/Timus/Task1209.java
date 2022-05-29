package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        List <Integer> integers = new ArrayList<>();
        int val=0;
        for (int i=1;i<=n;i++){
            val=in.nextInt();
            integers.add(val);
        }
        for (int i:integers) {
             int t=i*8+1;
             if(((int)Math.pow(Math.sqrt(t),2))==t){
                 System.out.print("0 ");
             }
             else System.out.print("1 ");
        }
    }
}
