package Programming.laba9.task1;

public class Example1 {
    public static void main(String[] args) {
       // в блок try помещается код, который необходимо проверить
        try{
            System.out.println("0");
            // брошено исключение, создан объект RuntimeException с сообщением "Непроверяемая ошибка"
            throw new RuntimeException("Непроверяемая ошибка");
        }
        // исключение перехвачено
        catch (RuntimeException e){
            //исключение обработано
            System.out.println("1 "+e);
        }
        // блок информации, идущий после блоков try и catch - запускается после обработки исключений в штатном порядке
        System.out.println("2");
    }
}
