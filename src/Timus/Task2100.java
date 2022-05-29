package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String res="";
        String [] words=new String [n];
        int count=2;
        char value;
        List <String> strings = new ArrayList <>();
        for(int i=0;i<n;i++) {
            res=in.nextLine();
            strings.add(res);
        }
        strings.toArray(words);
        for(int i=0;i<words.length;i++) {
            for(int j=0;j<words[i].length();j++) {
                value=words[i].charAt(j);
                if(value=='+') {
                    count++;
                }
            }
        }
        int resuilt=n+count;
        if(resuilt==13) {
            resuilt++;
        }
        System.out.println((resuilt)*100);

    }
}

