package Osnovi;


import java.util.Scanner;

public class Laboratory_work_3 {
    public static void main(String[] args) {
        Scanner mounth = new Scanner(System.in);
        System.out.println("Введите месяц с начала проекта");
        double a = mounth.nextInt();
        System.out.println("Введите запланированный срок сдачи проекта");
        Scanner idealmounth = new Scanner(System.in);
        double b = idealmounth.nextInt();
        System.out.println("Введите текущую степень готовности проекта, в %");
        Scanner stepengotovnosti = new Scanner(System.in);
        double c = stepengotovnosti.nextInt();
        double d = 100;
        double e = (a*d)/c;
        System.out.println("Задержка сроков, исходя из введенных данных равна: "+(e-b)+" месяца");
        System.out.println("Введите текущие расходы, в у.е.");
        Scanner rashodi = new Scanner(System.in);
        double f = rashodi.nextInt();
        System.out.println("Введите сумму запланированного бюджета");
        Scanner summabudgeta = new Scanner(System.in);
        double g = summabudgeta.nextInt();
        double h = (f*e)/a;
        System.out.println("Перерасход бюджета составил: "+Math.round(h-g)+" у.е.");
    }
}
