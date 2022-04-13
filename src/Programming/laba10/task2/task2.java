package Programming.laba10.task2;

import java.io.*;

public class task2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba10\\task2\\text1"));
        BufferedWriter wr = new BufferedWriter(new FileWriter("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba10\\task2\\text2"))) {
            String text;
            double number=0;
            int lineCount=0;
            while ((text= br.readLine())!=null){
                lineCount++;
                if(lineCount==2) {
                    wr.write(text);
                    wr.newLine();
                }
                else if (lineCount>2){
                    number = Double.valueOf(text);
                    if(number>0){
                        wr.write(text);
                        wr.newLine();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
