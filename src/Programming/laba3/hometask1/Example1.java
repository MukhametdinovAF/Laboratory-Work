package Programming.laba3.hometask1;

import java.util.Scanner;

public class Example1 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Вы ввели неверное число");
                break;
        }
    }

}
