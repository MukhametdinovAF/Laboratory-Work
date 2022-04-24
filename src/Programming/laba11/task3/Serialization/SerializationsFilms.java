package Programming.laba11.task3.Serialization;
import java.io.*;
import java.util.Scanner;
class Film implements Serializable{
    String name;
    int year;
    String country;
    String genre;
    int rentalCost;
}
public class SerializationsFilms {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Запись объекта в файл
        Scanner in = new Scanner(System.in,"cp1251");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba11\\task3\\Serialization\\Films");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Film films = new Film();
        System.out.println("Введите название фильма");
        films.name=in.nextLine();
        System.out.println("Введите год создания фильма");
        films.year=in.nextInt();
        in.nextLine();
        System.out.println("Введите страну, где фильм был снят");
        films.country=in.nextLine();
        System.out.println("Введите жанр фильма");
        films.genre=in.nextLine();
        System.out.println("Введите стоимость проката фильма");
        films.rentalCost=in.nextInt();
        in.nextLine();
        oos.writeObject(films);
        oos.flush();
        oos.close();
        // Чтение из файла
        FileInputStream fis = new FileInputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba11\\task3\\Serialization\\Films");
        ObjectInputStream oin = new ObjectInputStream(fis);
        films=(Film)oin.readObject();
        System.out.println("Название фильма "+films.name+", "+"Год выпуска "+films.year+", "+"Страна "+films.country+", "+"Жанр "+films.genre+", "+"Стоимость проката "+films.rentalCost);
        oos.close();
    }

}
