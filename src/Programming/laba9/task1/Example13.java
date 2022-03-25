package Programming.laba9.task1;

public class Example13 {
        public static void main(String[] args) {
            try { // запуск обработчика исключений
                int l = args.length; // ввод переменной l равной величине массива
                System.out.println("размер массива= " + l); // вывод информации, что l=0
                int h=10/l; // ввод переменной h, которая вычисляется путем деления 10 на l
                args[l + 1] = "10";
            } catch (ArithmeticException e) { // блок перехватывает исключение, вызванное делением на ноль
                System.out.println("Деление на ноль"); // выводится сообщение, что ошибка перехвачена обработчиком
            }catch (ArrayIndexOutOfBoundsException e) { //этот блок не выводится, так как ошибка перехвачена предыдущим блоком
                System.out.println("Индекс не существует");
            }
        }
    }


