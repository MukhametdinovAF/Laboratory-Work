package Programming.laba6.hometask2;

public class Example2 {
    private static int pole1;

    public static void setPole1(int pole1) {
        Example2.pole1 = pole1;
        pole1 =0;
    }
    public static void getPole1(){
        System.out.println(pole1);
        pole1++;
    }
}

//        Напишите программу с классом, в котором есть закрытое статическое
//        целочисленное ноле с начальным нулевым значением. В классе должен быть описан
//        статический метод, при вызове которого отображается текущее значение статического
//        поля, после чего значение поля увеличивается на единицу.
