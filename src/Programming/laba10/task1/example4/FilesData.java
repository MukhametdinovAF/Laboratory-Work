package Programming.laba10.task1.example4;

import java.io.*;
import java.util.Scanner;

public class FilesData {
    public static void main(String[] args) {
        try {

            // Создание исходного файла numIsh.txt и запись в него чисел типа float

            File f1 = new File("D:\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner sc = new Scanner(System.in,"windows-1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream("D:\\My\\numIsh.txt"));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();
            System.out.println("Введите числа:");

            for (int i = 0; i < count; i++){
                wr.writeFloat(sc.nextFloat());
                wr.flush();
                wr.close();
            }

            // Создание файла numRez.txt и переписывание в него чисел из numIsh.txt

            File f2 = new File("D:\\My\\numRez.txt");
            f2.createNewFile();

            // поток для чтения из исходного файла numIsh.txt

            DataInputStream rd = new DataInputStream(new FileInputStream("D:\\My\\numIsh.txt"));

            // поток для записи в результирующий файл numRez.txt

            wr = new DataOutputStream(new FileOutputStream("D:\\My\\numRez.txt"));
            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число " + (float) number);
                }
            } catch (EOFException e) {

            }
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}



