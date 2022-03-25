package Programming.laba9.task1;

public class Example11 {
        public static void main(String[] args) {
            try { // запуск обработчика исключений
                System.out.println("0"); // вывод 0
                throw new NullPointerException("ошибка"); // брошено исключение с текстом ошибка
            } catch (NullPointerException e) { // исключение перехвачено
                System.out.println("1" ); // вывод 1
            }finally { // блок кода выполняется после блока catch в обязательном порядке
                System.out.println("2" ); // вывод 2
            }
            System.out.println("3"); // свободный блок кода выполняется в штатном режиме, выводится 3
        }
}

