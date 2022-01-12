package Programming.laba1.hometask14;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name=in.nextLine();
        System.out.print("Input Age: ");
        int age = in.nextInt();
        long area = Math.round(2021-age);
        System.out.printf("Name: %s Birth year: %s", name, area);
        in.close();
    }
}
