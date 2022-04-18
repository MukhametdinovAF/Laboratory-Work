package Shildt;
import java.io.*;
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // сначала убедиться, что имя указано
        if(args.length!=1){
            System.out.println("Использование: ShowFile имя_файла");
//            return;
        }
        // попытка открыть файл
        try {
            fin = new FileInputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Shildt\\ShowFile");

        }
        catch (FileNotFoundException e){
            System.out.println("Невозможно открыть файл");
            return;
        }
        // теперь файл открыт и готов к чтению
        // далее из него читаются символы до тех пор,
        // пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }
            while (i != -1);
        }
        catch (IOException e){
            System.out.println("Ошибка чтения из файла");
            }
        // закрыть файл
        try {
            fin.close();

        }
        catch (IOException e){
            System.out.println("Ошибка закрытия файла");
        }
    }
}
