package Programming.laba3.hometask2;

import java.util.Scanner;

public class Example2 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String day = scanner.nextLine();
        switch(day){
            case "понедельник":
                System.out.println("Это 1 день недели");
                break;
            case "вторник":
                System.out.println("Это 2 день недели");
                break;
            case "среда":
                System.out.println("Это 3 день недели");
                break;
            case "четверг":
                System.out.println("Это 4 день недели");
                break;
            case "пятница":
                System.out.println("Это 5 день недели");
                break;
            case "суббота":
                System.out.println("Это 6 день недели");
                break;
            case "воскресенье":
                System.out.println("Это 7 день недели");
                break;
            default:
                System.out.println("Такого дня недели не существует");
                break;
        }
    }
}
