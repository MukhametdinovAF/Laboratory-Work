package Timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1496 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nums=in.nextInt();
        in.nextLine();
        List <String> strings = new ArrayList<>();
        String input="";
        for (int i=0;i<nums;i++){
            input=in.nextLine();
            strings.add(input);
        }

    }
}
