package Programming.laba1.hometask13;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = in.nextLine();
        System.out.print("Input Birth year: ");
        int byear = in.nextInt();
        long area = Math.round(2021-byear);
        System.out.printf("Name: %s Age: %s", name, area);
        in.close();
    }
}
