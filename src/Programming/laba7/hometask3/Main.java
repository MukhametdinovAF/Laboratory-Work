package Programming.laba7.hometask3;

public class Main {
    public static void main(String[] args) {
    SuperClass spc = new SuperClass(3);
    SubClass sbc = new SubClass(2,'a');
    SubSubClass ssbc = new SubSubClass(4,'v',"World");
    String className = spc.toString();
    System.out.println(className);
    String subClassName = sbc.toString();
    System.out.println(subClassName);
    String subSubClassName = ssbc.toString();
    System.out.println(subSubClassName);

    }

}
//        Напишите программу, в которой на основе суперкласса создается подкласс, а на
//        основе этого подкласса создается еще один подкласс (цепочка наследования из трех
//        классов). В первом суперклассе есть открытое целочисленное поле, метод с одним
//        параметром для присваивания значения полю и конструктор с одним параметром. Во
//        втором классе появляется открытое символьное поле, метод с двумя параметрами для
//        присваивания значения полям (перегрузка метода из суперкласса) и конструктор с двумя
//        параметрами. В третьем классе появляется открытое текстовое ноле, метод с тремя
//        аргументами для присваивания значений полям (перегрузка метода из суперкласса) и
//        конструктор с тремя параметрами. Для каждого класса определите метод toString () так,
//        чтобы он возвращал строку с названием класса и значениями всех полей объекта.