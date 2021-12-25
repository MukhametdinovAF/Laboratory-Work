package Timus;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1787 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> mass = new ArrayList<>();
        while (in.hasNext()){
            mass.add(in.nextInt());
        }
        int count = 0;
        for(int i=0;i<n;i++){
            count=count+ mass.get(i)-k;
            if(count<0){
                count=0;
            }
        }

        out.println(count);
        out.flush();
    }
}
