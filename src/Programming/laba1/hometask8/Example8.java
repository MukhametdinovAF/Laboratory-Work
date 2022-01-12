package Programming.laba1.hometask8;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Surname: ");
        String surname = in.nextLine();
        System.out.print("Input Name: ");
        String name = in.next();
        System.out.print("Input Middle name: ");
        String middlename = in.next();
        System.out.printf("Hello %s %s %s", surname, name, middlename);
        in.close();
    }
}
