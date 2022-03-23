package Programming.laba9.task1;

public class Example8 {
    public class Except1{
        public static int m(){
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }
    }
}
