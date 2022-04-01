package Programming.laba10.task1.example10;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out=null;
        try {
// Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("D:\\MyFile1.txt"),"cp1251"));
            PrintWriter out1 = new PrintWriter("D:\\MyFile2.txt","cp1251");
// Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null) {
                lineCount++;
                out1.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally{
            br.close();
            out.flush();
            out.close();
        }}
}
