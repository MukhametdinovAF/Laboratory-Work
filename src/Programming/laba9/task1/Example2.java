package Programming.laba9.task1;

public class Example2 {
    public static void main(String[] args) {
        // создан блок try для проверки кода
        try {
            System.out.println("0");
            // брошено исключение, создан объект RuntimeException с сообщением "Непроверяемая ошибка"
            throw new RuntimeException("Непроверяемая ошибка");
            // создан блок catch с классом Exception, который является "предком" класса RuntimeException
        } catch (Exception e) {
            // исключение перехвачено перехватчиком предка
            System.out.println("2 " + e);
        }
        // блок кода идущий вслед за блоками try и catch запускается в штатном порядке
        System.out.println("3");
    }
}