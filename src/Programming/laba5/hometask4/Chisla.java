package Programming.laba5.hometask4;

public class Chisla {
    private int number;
    private char symbol;
    private double argument;

    public Chisla(int number, char symbol) {
        this.number = number;
        this.symbol = symbol;
        System.out.println(number);
        System.out.println(symbol);
    }

    public Chisla(double argument) {
        this.argument = argument;
        System.out.println((char)argument);
        double arg = argument*100;
        int arg2 = (int)argument*100;
        int arg1 = (int) arg;
        int arg3 = arg1-arg2;
        System.out.println(arg3);
    }
}




//        Напишите программу с классом, у которого есть символьное и
//        целочисленное поле. В классе должны быть описаны версии конструктора с
//        двумя аргументами (целое число и символ – определяют значения полей), а
//        также с одним аргументом типа double. В последнем случае действительная
//        часть аргумента определяет код символа (значение символьного поля), а
//        дробная часть (с учетом десятых и сотых) определяет значение
//        целочисленного поля. Например, если аргументом передается число 65.1267,
//        то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//        поле получит значение 12 (в дробной части учитываются только десятые и
//        сотые)