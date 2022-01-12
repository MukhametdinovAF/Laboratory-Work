package Programming.laba1.hometask12;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Birth year: ");
        int byear = in.nextInt();
        long area = Math.round(2021-byear);
        System.out.printf("%s", area);
        in.close();
    }
}
