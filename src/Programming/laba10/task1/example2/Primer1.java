package Programming.laba10.task1.example2;

import java.io.*;
import java.net.URL;

public class Primer1 {
    // метод для чтения данных из потока по байтам с выводом
    public static void readAllByByte (InputStream in) throws IOException{
        while (true){
            int oneByte = in.read(); // читает один байт
            if (oneByte!=-1) {        // признак отсутствия конца файла
                System.out.print((char)oneByte);
            }
            else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        try {

            // с потоком связан файл

            InputStream inFile = new FileInputStream("d:/My/text.txt");
            readAllByByte(inFile);
            System.out.print("\n\n\n");
            inFile.close();

            // с потоком связана интернет страница

            try (InputStream inUrl = new URL("http://google.com").openStream()) {
                readAllByByte(inUrl);
                System.out.print("\n\n\n");

            }

            // с потоком связан массив типа byte

            ByteArrayInputStream inArray = new ByteArrayInputStream(new byte[]{7,9,3,7,4});
            readAllByByte(inArray);
            System.out.print("\n\n\n");
            inArray.close();
        }
        catch (IOException e){
            System.out.println("Ошибка"+e);
        }
    }
}

