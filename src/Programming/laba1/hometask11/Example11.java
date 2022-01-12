package Programming.laba1.hometask11;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Month: ");
        String month = in.nextLine();
        System.out.print("Input Number of days: ");
        int days = in.nextInt();
        System.out.printf(" %s - %s", month, days);
        in.close();
    }
}
