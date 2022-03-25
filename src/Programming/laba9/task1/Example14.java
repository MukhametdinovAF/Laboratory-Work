package Programming.laba9.task1;

public class Example14 {
        public static void m(int x) throws ArithmeticException{ // метод способный к порождению исключений определен с помощью ключевого слова throws
            int h=10/x; // введение переменной, которая получается путем деления 10 на переменную, получаемую в результате передачи ее методу аргументом
        }
        public static void main(String[] args) {
            try { // обработчик исключений
                int l = args.length; // вводится переменная l равная величине массива args
                System.out.println("размер массива= " + l); // вывод информации о размере массива args (равен нулю)
                m(l); // вызов метода m с переменной l - равной величине массива
            } catch (ArithmeticException e) { // отлов ошибки вызванной делением на ноль
                System.out.println("Ошибка: Деление на ноль"); // ошибка вызванная делением на ноль перехвачена
            }
        }
    }

