package Programming.laba10.task3;
import java.io.*;

public class task3 {

        public static String split (String [] words){
            String resuilt="";
            char c;
            char [] sogl ={'Б','б','В','в','Г','г','Д','д','Ж','ж','З','з','Й','й','К','к','Л','л','М','м','Н','н','П','п','Р','р','С','с','Т','т','Ф','ф','Х','х','Ц','ц','Ч','ч','Ш','ш','Щ','щ'};
            for(int i=0;i< words.length;i++){
                c=words[i].charAt(0);
                for(int j=0;j< sogl.length;j++){
                    if(c==sogl[j]){
                        resuilt=resuilt+words[i]+" ";
                    }
                }
            }
            return resuilt;
        }

        public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba10\\task3\\text1")));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\ekb-l\\IdeaProjects\\Laboratory Work\\src\\Programming\\laba10\\task3\\text2",true)))){
            String poetry;
            while ((poetry= br.readLine())!=null){
                String [] words = poetry.split(" ");
                wr.write(task3.split(words));
                wr.newLine();
            }
        }  catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}