package Programming.laba11.task2;

import java.io.*;
import java.util.Objects;

public class StringSplit {
    public static String Split(String [] words) {
        String result = "";

        int counter=0;
        char c;

        for (int i = 1; i < words.length; i++) {
            c = words[0].toLowerCase().charAt(0);
                if (Objects.equals(c,words[i].charAt(0))) {
                    result = result + words[i] + " ";
                    counter++;
                }
            }

        return result+" || выбрано слов: "+counter;
    }


    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba11\\task2\\Esenin"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba11\\task2\\AfterSplit"))){
            String s;
            int count=1;
        while  ((s= br.readLine())!=null){
            String [] words = s.split(" ");
            writer.write(count+" "+StringSplit.Split(words));
            writer.newLine();
            count++;
        }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
