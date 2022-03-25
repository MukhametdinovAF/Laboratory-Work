package Programming.laba9.task1;

public class Example5 {
    public static void main(String[] args) {
        // создан блок try для проверки кода
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка"); //брошено исключение, создан объект RuntimeException с сообщением "ошибка"
        } catch (NullPointerException e) { // в блоке catch указан класс, который не перехватывает брошенное ранее исключение
            System.out.println("1" );      // это приводит к тому, что ошибка не перехватывается и программа останавливается
        }
        System.out.println("2");// эта информация не выводится в виду того, что ошибка не была перехвачена и программа остановилась
    }
}
