package Programming.laba9.task1;

public class Example9 {
        public static int m(){
            try { // запущен обработчик
                System.out.println("0");
                return 55; // выход из метода
            } finally { // код выполнится вслед за System.out.println("0") несмотря на выход из метода посредством команды return
                System.out.println("1");
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }
}


