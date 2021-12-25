package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task2012 {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            int a = in.nextInt();
            int b = 12;
            int raznica = b-a;
            int ostatok = raznica * 45;
            int vsego = 4 * 60;
            if (ostatok<vsego){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
    }
}



