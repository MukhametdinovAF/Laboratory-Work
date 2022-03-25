package Programming.laba9.task1;

public class Example7 {
    public static void main(String[] args) {
        try { // проверка исключения
            System.out.println("0");
            throw new NullPointerException("ошибка"); // брошено исключение
        } catch (NullPointerException e) { // исключение перехвачено
            System.out.println("1");
        }
        try { // чтобы код запустился добавлен новый обработчик исключения
            System.out.println("4");
            throw new ArithmeticException(); // брошено исключение
        } catch (ArithmeticException e) { // исключение перехвачено
            System.out.println("2");
        }
        System.out.println("3"); // блок кода идущий после всех блоков, запускается в штатном режиме
    }
}