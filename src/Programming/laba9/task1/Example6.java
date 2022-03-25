package Programming.laba9.task1;

public class Example6 {
    public static void main(String[] args) {

        try { // создан блок try для проверки кода
            System.out.println("0");
            throw new NullPointerException("ошибка"); //брошено исключение, создан объект RuntimeException с сообщением "ошибка"
        } catch (ArithmeticException e) { //этот блок catch не обработает исключение
            System.out.println("1");
        } catch (RuntimeException e) { //этот блок catch вызывался после своего предка, а должен был вызываться до предка
            System.out.println("3");   //компилятор не позволил запустить программу, поэтому я поменял местами блоки catch (Exception e) и catch (RuntimeException e)
        } catch (Exception e) {
            System.out.println("2");
        }
        System.out.println("4"); // блок кода, идущий за блоками try и catch, вызывается в штатном порядке
    }
}
