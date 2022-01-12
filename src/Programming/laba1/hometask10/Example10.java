package Programming.laba1.hometask10;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Day of the weak: ");
        String day = in.nextLine();
        System.out.print("Input Month: ");
        String month = in.next();
        System.out.print("Input Date: ");
        int date = in.nextInt();
        System.out.printf("%s, %s, %s", day, date, month);
        in.close();
    }
}
