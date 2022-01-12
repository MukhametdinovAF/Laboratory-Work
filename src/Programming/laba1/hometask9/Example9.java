package Programming.laba1.hometask9;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Name: ");
        String name = in.nextLine();
        System.out.print("Input Age: ");
        int age = in.nextInt();
        System.out.printf("Name: %s Age: %s", name, age);
        in.close();
    }
}
