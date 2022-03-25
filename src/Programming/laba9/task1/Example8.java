package Programming.laba9.task1;

public class Example8 {
    public static int m() { // генерация исключения в методе
            try { // блок try внутри метода
                System.out.println("0");
                throw new RuntimeException(); // брошено исключение RuntimeException
            } finally {                     // блок кода который отработает в любом случае после блока try даже несмотря на то,
                                            // что программа остановилась, ввиду того, что ошибка не была перехвачена
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }



