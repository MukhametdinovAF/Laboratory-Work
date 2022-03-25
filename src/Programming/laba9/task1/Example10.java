package Programming.laba9.task1;

public class Example10 {
        public static int m(){
            try { // запускается обработчик исключений
                System.out.println("0"); // выполняется вывод 0
                return 15; // выход из метода со значением 15
            } finally { // выполняется этот блок кода и меняет значение переменной метода с 15 на 20
                System.out.println("1"); // вывод 1
                return 20; // вывод 20
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }
}

