package Programming.laba4.hometask8;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        System.out.println("Введите текст для шифрования");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        char[] ArrayChar = string.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + key;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }
        string = new String(ArrayCharNew);
        System.out.println("Текст после преобразования:");
        System.out.println(string);
        System.out.println();
        System.out.println("Выполнить обратное преобразование? (y/n)");
        Scanner scn = new Scanner(System.in);
        String reverse = scn.nextLine();
        switch (reverse) {
            case "y" -> {
                char[] ArrayChar1 = string.toCharArray();
                long[] ArrayInt1 = new long[ArrayChar1.length];
                char[] ArrayCharNew1 = new char[ArrayChar1.length];
                for (int i = 0; i < ArrayChar1.length; i++) {
                    ArrayInt1[i] = ArrayChar1[i] - key;
                    ArrayCharNew1[i] = (char) ArrayInt1[i];
                }
                string = new String(ArrayCharNew1);
                System.out.println(string);
            }
            case "n" -> System.out.println("До свидания!");
            default -> System.out.println("Вы ввели некорректные данные!");
        }

    }
}
