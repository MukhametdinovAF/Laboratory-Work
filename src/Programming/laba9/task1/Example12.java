package Programming.laba9.task1;

public class Example12 {

        public static void m(String str, double chislo){ // создан метод принимающий на вход аргументами: строку и число
            if (str==null) { // условие, при котором выбрасывается исключение IllegalArgumentException
                throw new IllegalArgumentException("Строка введена неверно"); // исключение IllegalArgumentException с текстом "Строка введена неверно"
            }
            if (chislo>0.001) { // условие, при котором выбрасывается исключение IllegalArgumentException
                throw new IllegalArgumentException("Неверное число"); // исключение IllegalArgumentException с текстом "Неверное число"
            }
        }
        public static void main(String[] args) {
            m(null,0.000001); // запуск метода, в котором выполняется первое условие выброса исключения, таким образом программа
                                        // останавливается и выбрасывается исключение IllegalArgumentException с текстом "Строка введена неверно"
        }
    }


