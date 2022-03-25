package Programming.laba9.task1;

public class Example4 {
    public static void main(String[] args) {
        // создан блок try для проверки кода
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");// брошено исключение, создан объект RuntimeException с сообщением "ошибка"
            // далее следует три блока catch, которые должны перехватить брошенное исключение
        } catch (NullPointerException e) { // данный блок не перехватывает указанную ошибку
            System.out.println("1" );
        }catch (Exception e) { // данный блок перехватывает указанную ошибку, так как является предком для брошенного исключения
            System.out.println("2" );
        }catch (Error e) { // данный блок не запускается, ошибка перехвачена предыдущим блоком
            System.out.println("3" );
        }
        System.out.println("4"); // блок кода идущий после блоков try и catch, запускается в штатном режиме
    }

}
