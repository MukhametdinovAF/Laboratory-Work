package Programming.laba9.task1;

public class Example3 {
    public static void main(String[] args) {
        // создан блок try для проверки кода
        try {
            System.out.println("0");
            // брошено исключение, создан объект RuntimeException с сообщением "ошибка"
            throw new RuntimeException("ошибка");
        // далее следует три блока catch, которые должны перехватить брошенное исключение
        } catch (NullPointerException e) { // данный блок не перехватывает указанную ошибку
            System.out.println("1" );

        }catch (RuntimeException e) { // данный блок перехватывает указанную ошибку
            System.out.println("2" );
        }catch (Exception e) { // данный блок не запускается, так как ошибка успешно обработана предыдущим блоком
            System.out.println("3" );
        }
        System.out.println("4"); // блок кода идущий после блоков try и catch, запускается в штатном режиме
    }
}
