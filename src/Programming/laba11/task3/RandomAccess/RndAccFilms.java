package Programming.laba11.task3.RandomAccess;
import java.io.*;
import java.util.*;

public class RndAccFilms {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile =
                    new RandomAccessFile("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory-Work\\src\\Programming\\laba11\\task3\\RandomAccess\\Films", "rw");
            long fSize = randomAccessFile.length();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество фильмов для записи в файл\n" + "=> ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            String name, country, genre, year;
            int rentalCost;

            for (int i = 0; i < quantity; i++) {
                System.out.println("Введите название " + (i + 1) + " фильма => ");
                name = scanner.next();
                scanner.nextLine();
                randomAccessFile.seek(randomAccessFile.length());
                randomAccessFile.writeUTF(name);
                for (int j = 0; j < 20 - name.length(); j++)
                    randomAccessFile.writeByte(1);
                System.out.println("Введите год выпуска этого фильма => ");
                year = scanner.next();
                randomAccessFile.writeUTF(year);
                for (int m = 0; m < 20 - year.length(); m++) {
                    randomAccessFile.writeByte(1);
                }
                scanner.nextLine();
                System.out.println("Введите страну производства этого фильма => ");
                country = scanner.next().toLowerCase(Locale.ROOT);
                randomAccessFile.writeUTF(country);
                for (int k = 0; k < 20 - country.length(); k++)
                    randomAccessFile.writeByte(1);
                System.out.println("Введите жанр этого фильма => ");
                genre = scanner.next();
                randomAccessFile.writeUTF(genre);
                for (int l = 0; l < 20 - genre.length(); l++)
                    randomAccessFile.writeByte(1);
                System.out.println("Введите стоимость проката данного фильма (в млн.) => ");
                rentalCost = scanner.nextInt();
                randomAccessFile.writeInt(rentalCost);
                scanner.nextLine();
            }
            randomAccessFile.close();
            randomAccessFile =
                    new RandomAccessFile
                            ("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory-Work\\src\\Programming\\laba11\\task3\\RandomAccess\\Films", "r");
            randomAccessFile.seek(0);
            System.out.println("Информация о фильмах");
            System.out.println("Название \t\t Год выпуска \t\t Страна \t\t Жанр \t\t Стоимость проката");
            for (int i = 0; i < quantity; i++) {
                name = randomAccessFile.readUTF();
                for (int j = 0; j < 20 - name.length(); j++)
                    randomAccessFile.readByte();
                year = randomAccessFile.readUTF();
                for (int m = 0; m < 20 - year.length(); m++)
                    randomAccessFile.readByte();
                country = randomAccessFile.readUTF();
                for (int k = 0; k < 20 - country.length(); k++)
                    randomAccessFile.readByte();
                genre = randomAccessFile.readUTF();
                for (int l = 0; l < 20 - genre.length(); l++)
                    randomAccessFile.readByte();
                rentalCost = randomAccessFile.readInt();
                System.out.println(name + "\t\t\t" + year + "\t\t\t" + country + "\t\t\t" + genre + "\t\t\t" + rentalCost);

            }
            randomAccessFile.close();
            PrintWriter pw = new PrintWriter("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory-Work\\src\\Programming\\laba11\\task3\\RandomAccess\\Rissian");
            randomAccessFile =
                    new RandomAccessFile
                            ("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory-Work\\src\\Programming\\laba11\\task3\\RandomAccess\\Films", "r");
            pw.print("Название \t\t Год выпуска \t\t Страна \t\t Жанр \t\t Стоимость проката");
            for (int i = 0; i < quantity; i++) {

                name = randomAccessFile.readUTF();
                for (int j = 0; j < 20 - name.length(); j++) {
                    randomAccessFile.readByte();
                }
                year = randomAccessFile.readUTF();
                for (int m = 0; m < 20 - year.length(); m++) {
                    randomAccessFile.readByte();
                }
                country = randomAccessFile.readUTF();
                for (int k = 0; k < 20 - country.length(); k++) {
                    randomAccessFile.readByte();
                }
                genre = randomAccessFile.readUTF();
                for (int l = 0; l < 20 - genre.length(); l++) {
                    randomAccessFile.readByte();
                }
                rentalCost = randomAccessFile.readInt();
                long count = randomAccessFile.getFilePointer();

                randomAccessFile.seek(count-42);
                if (country.equals("россия")) {
                    randomAccessFile.seek(count-82);
                    pw.print("\n"+name+"\t\t\t\t"+year+"\t\t\t"+country.toUpperCase(Locale.ROOT)+"\t\t\t"+genre+"\t\t\t\t"+rentalCost);
                    randomAccessFile.seek(count);
                }
                else randomAccessFile.seek(count);
            }
            pw.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
